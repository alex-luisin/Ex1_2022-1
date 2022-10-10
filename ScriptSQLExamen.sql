DROP TABLE IF EXISTS integrante_grupo_investigacion;
DROP TABLE IF EXISTS grupo_investigacion;
DROP TABLE IF EXISTS profesor;
DROP TABLE IF EXISTS alumno;
DROP TABLE IF EXISTS miembro_pucp;
DROP TABLE IF EXISTS seccion;
DROP TABLE IF EXISTS tipo_miembro;
CREATE TABLE tipo_miembro(
	id_tipo_miembro CHAR,
    descripcion VARCHAR(100),
    PRIMARY KEY(id_tipo_miembro)
)ENGINE=innodb;
CREATE TABLE miembro_pucp(
	id_miembro_pucp INT AUTO_INCREMENT,
    fid_tipo_miembro CHAR,
    codigo_PUCP VARCHAR(8),
    DNI VARCHAR(8),
    nombres VARCHAR(100),
    apellido_paterno VARCHAR(70),
    apellido_materno VARCHAR(70),
    genero CHAR(1),
    fecha_nacimiento DATE,
    PRIMARY KEY(id_miembro_pucp),
    FOREIGN KEY(fid_tipo_miembro) REFERENCES tipo_miembro(id_tipo_miembro)
)ENGINE=innodb;
CREATE TABLE profesor(
	id_profesor INT,
    categoria VARCHAR(50),
    activo TINYINT,
    PRIMARY KEY(id_profesor),
    FOREIGN KEY(id_profesor) REFERENCES miembro_pucp(id_miembro_pucp)
)ENGINE=innodb;
CREATE TABLE alumno(
	id_alumno INT,
    CRAEST DECIMAL(10,2),
    activo TINYINT,
    PRIMARY KEY(id_alumno),
    FOREIGN KEY(id_alumno) REFERENCES miembro_pucp(id_miembro_pucp)
)ENGINE=innodb;
CREATE TABLE seccion(
	id_seccion INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    activo TINYINT,
    PRIMARY KEY(id_seccion)
)ENGINE=innodb;
CREATE TABLE grupo_investigacion(
	id_grupo_investigacion INT AUTO_INCREMENT,
    fid_seccion INT,
    nombre VARCHAR(200),
    siglas VARCHAR(50),
    anho_fundacion VARCHAR(4),
    interdisciplinario TINYINT,
    descripcion VARCHAR(5000),
    foto LONGBLOB,
    archivo_adicional_PDF LONGBLOB,
    activo TINYINT,
    PRIMARY KEY(id_grupo_investigacion),
    FOREIGN KEY (fid_seccion) REFERENCES seccion(id_seccion)
)ENGINE=innodb;
CREATE TABLE integrante_grupo_investigacion(
	id_integrante_grupo_investigacion INT AUTO_INCREMENT,
    fid_grupo_investigacion INT,
    fid_miembro_pucp INT,
    fecha_hora_registro DATETIME,
    activo TINYINT,
    PRIMARY KEY(id_integrante_grupo_investigacion),
    FOREIGN KEY(fid_grupo_investigacion) REFERENCES grupo_investigacion(id_grupo_investigacion),
    FOREIGN KEY(fid_miembro_pucp) REFERENCES miembro_pucp(id_miembro_pucp)
)ENGINE=innodb;
DROP PROCEDURE IF EXISTS INSERTAR_PROFESOR;
DROP PROCEDURE IF EXISTS INSERTAR_ALUMNO;
DROP PROCEDURE IF EXISTS LISTAR_SECCIONES_X_NOMBRE;
DROP PROCEDURE IF EXISTS LISTAR_MIEMBROS_PUCP_X_NOMBRE_CODIGO_PUCP;
DROP PROCEDURE IF EXISTS INSERTAR_GRUPO_INVESTIGACION;
DROP PROCEDURE IF EXISTS INSERTAR_INTEGRANTE_DE_GRUPO_INVESTIGACION;
DROP PROCEDURE IF EXISTS LISTAR_GRUPOS_X_NOMBRE;
DROP PROCEDURE IF EXISTS LISTAR_INTEGRANTES_X_ID_GRUPO;
DELIMITER $
CREATE PROCEDURE INSERTAR_PROFESOR(
	OUT _id_profesor INT,
    IN _fid_tipo_miembro CHAR(1),
    IN _codigo_PUCP VARCHAR(8),
    IN _DNI VARCHAR(8),
    IN _nombres VARCHAR(100),
    IN _apellido_paterno VARCHAR(70),
    IN _apellido_materno VARCHAR(70),
    IN _genero CHAR(1),
    IN _fecha_nacimiento DATETIME,
    IN _categoria VARCHAR(50)
)
BEGIN
	INSERT INTO miembro_pucp(fid_tipo_miembro,codigo_PUCP,DNI,nombres,apellido_paterno,apellido_materno,genero,fecha_nacimiento) VALUES(_fid_tipo_miembro,_codigo_PUCP,_DNI,_nombres,_apellido_paterno,_apellido_materno,_genero,_fecha_nacimiento);
    SET _id_profesor = @@last_insert_id;
    INSERT INTO profesor(id_profesor,categoria,activo) VALUES(_id_profesor,_categoria,1);
END$
CREATE PROCEDURE INSERTAR_ALUMNO(
	OUT _id_alumno INT,
    IN _fid_tipo_miembro CHAR(1),
    IN _codigo_PUCP VARCHAR(8),
    IN _DNI VARCHAR(8),
    IN _nombres VARCHAR(100),
    IN _apellido_paterno VARCHAR(70),
    IN _apellido_materno VARCHAR(70),
    IN _genero CHAR(1),
    IN _fecha_nacimiento DATETIME,
    IN _CRAEST DECIMAL(10,2)
)
BEGIN
	INSERT INTO miembro_pucp(fid_tipo_miembro,codigo_PUCP,DNI,nombres,apellido_paterno,apellido_materno,genero,fecha_nacimiento) VALUES(_fid_tipo_miembro,_codigo_PUCP,_DNI,_nombres,_apellido_paterno,_apellido_materno,_genero,_fecha_nacimiento);
    SET _id_alumno = @@last_insert_id;
    INSERT INTO alumno(id_alumno,CRAEST,activo) VALUES(_id_alumno,_CRAEST,1);
END$
CREATE PROCEDURE LISTAR_SECCIONES_X_NOMBRE(
	_nombre VARCHAR(100)
)
BEGIN
	SELECT id_seccion, nombre FROM seccion WHERE activo = 1 AND nombre LIKE CONCAT('%',_nombre,'%');
END$
CREATE PROCEDURE LISTAR_MIEMBROS_PUCP_X_NOMBRE_CODIGO_PUCP(
	_nombre_codigo_PUCP VARCHAR(240)
)
BEGIN
	SELECT mp.id_miembro_pucp, tp.id_tipo_miembro, tp.descripcion as tipo, mp.codigo_PUCP, mp.DNI, mp.nombres, mp.apellido_paterno, mp.apellido_materno, mp.genero, mp.fecha_nacimiento, p.categoria, a.CRAEST FROM miembro_pucp mp LEFT JOIN profesor p ON mp.id_miembro_pucp = p.id_profesor LEFT JOIN alumno a ON mp.id_miembro_pucp = a.id_alumno INNER JOIN tipo_miembro tp ON tp.id_tipo_miembro = mp.fid_tipo_miembro WHERE ((mp.codigo_PUCP LIKE concat('%',_nombre_codigo_PUCP,'%')) OR (CONCAT(mp.nombres,' ',mp.apellido_paterno,' ',mp.apellido_materno) LIKE concat('%',_nombre_codigo_PUCP,'%'))) AND (p.activo = 1 OR a.activo = 1);
END$
CREATE PROCEDURE INSERTAR_GRUPO_INVESTIGACION(
	OUT _id_grupo_investigacion INT,
    IN _fid_seccion INT,
    IN _nombre VARCHAR(200),
    IN _siglas VARCHAR(50),
    IN _anho_fundacion VARCHAR(4),
    IN _interdisciplinario TINYINT,
    IN _descripcion VARCHAR(5000),
    IN _foto LONGBLOB,
    IN _archivo_adicional_PDF LONGBLOB
)
BEGIN
	INSERT INTO grupo_investigacion(fid_seccion,nombre,siglas,anho_fundacion,interdisciplinario,descripcion,foto,archivo_adicional_PDF,activo) VALUES(_fid_seccion,_nombre,_siglas,_anho_fundacion,_interdisciplinario,_descripcion,_foto,_archivo_adicional_PDF,1);
    SET _id_grupo_investigacion = @@last_insert_id;
END$
CREATE PROCEDURE INSERTAR_INTEGRANTE_DE_GRUPO_INVESTIGACION(
	OUT _id_integrante_grupo_investigacion INT,
    IN _fid_grupo_investigacion INT,
    IN _fid_miembro_pucp INT
)
BEGIN
	INSERT INTO integrante_grupo_investigacion(fid_grupo_investigacion,fid_miembro_pucp,fecha_hora_registro,activo) VALUES(_fid_grupo_investigacion,_fid_miembro_pucp,now()-interval 5 hour,1);
	SET _id_integrante_grupo_investigacion = @@last_insert_id;
END$
CREATE PROCEDURE LISTAR_GRUPOS_X_NOMBRE(
	_nombre VARCHAR(200)
)
BEGIN
	SELECT gi.id_grupo_investigacion, s.id_seccion, s.nombre as nombre_seccion, gi.nombre as nombre_grupo, gi.siglas, gi.anho_fundacion, gi.interdisciplinario, gi.descripcion, gi.foto, gi.archivo_adicional_PDF FROM grupo_investigacion gi INNER JOIN seccion s ON gi.fid_seccion = s.id_seccion WHERE ((gi.activo = 1) AND (gi.nombre LIKE CONCAT('%',_nombre,'%')));
END$
CREATE PROCEDURE LISTAR_INTEGRANTES_X_ID_GRUPO(
	_id_grupo_investigacion INT
)
BEGIN
	SELECT mp.id_miembro_pucp, tp.id_tipo_miembro, tp.descripcion as tipo, mp.codigo_PUCP, mp.DNI, mp.nombres, mp.apellido_paterno, mp.apellido_materno, mp.genero, mp.fecha_nacimiento, p.categoria, a.CRAEST FROM miembro_pucp mp LEFT JOIN profesor p ON mp.id_miembro_pucp = p.id_profesor LEFT JOIN alumno a ON mp.id_miembro_pucp = a.id_alumno INNER JOIN tipo_miembro tp ON tp.id_tipo_miembro = mp.fid_tipo_miembro INNER JOIN integrante_grupo_investigacion igi ON mp.id_miembro_pucp = igi.fid_miembro_pucp WHERE igi.fid_grupo_investigacion =  _id_grupo_investigacion AND igi.activo = 1;
END$
DELIMITER ;
INSERT INTO tipo_miembro(id_tipo_miembro,descripcion) VALUES('P',"PROFESOR");
INSERT INTO tipo_miembro(id_tipo_miembro,descripcion) VALUES('A',"ALUMNO");
CALL INSERTAR_PROFESOR(@id_profesor1,'P','20119821','18004343','CESAR AGUSTO','MENDOZA','IBAÑEZ','M','1980-05-23','CONTRATADO');
CALL INSERTAR_PROFESOR(@id_profesor2,'P','19973102','39002256','NICOL STEFANY','RUIZ','CASTILLO','F','1979-11-19','AUXILIAR');
CALL INSERTAR_PROFESOR(@id_profesor3,'P','20092972','27006912','KEIRA BRIGETTE','SUAREZ','MURILLO','F','1990-01-11','ASOCIADO');
CALL INSERTAR_PROFESOR(@id_profesor4,'P','19820199','92003351','DAMARIS LUCERO','CELIS','CASTRO','F','1956-09-09','AUXILIAR');
CALL INSERTAR_PROFESOR(@id_profesor5,'P','19992984','32000527','WILMER JOEL','SIFUENTES','PAREDES','M','1967-05-25','PRINCIPAL');
CALL INSERTAR_PROFESOR(@id_profesor6,'P','19931982','23097573','RENATO DANIEL','SANDOVAL','ULLOA','M','1952-04-10','CONTRATADO');
CALL INSERTAR_ALUMNO(@id_alumno1,'A','20108321','29801864','JORGE LUIS','CARBALLIDO','AÑORGA','M','1999-02-11',78.23);
CALL INSERTAR_ALUMNO(@id_alumno2,'A','20129830','10805064','ELIZABETH','DE LA CRUZ','PEREZ','F','1999-01-29',87.22);
CALL INSERTAR_ALUMNO(@id_alumno2,'A','20112303','11806564','CRISTIAN','AVILA','JIMENEZ','M','1999-07-19',90.44);
INSERT INTO seccion(nombre,activo) VALUES('ELECTRICIDAD Y ELECTRÓNICA',1);
INSERT INTO seccion(nombre,activo) VALUES('INGENIERÍA CIVIL',1);
INSERT INTO seccion(nombre,activo) VALUES('INGENIERÍA INDUSTRIAL',1);
INSERT INTO seccion(nombre,activo) VALUES('INGENIERÍA INFORMÁTICA',1);
INSERT INTO seccion(nombre,activo) VALUES('INGENIERÍA MECÁNICA',1);
INSERT INTO seccion(nombre,activo) VALUES('INGENIERÍA DE MINAS',1);
INSERT INTO seccion(nombre,activo) VALUES('INGENIERÍA DE LAS TELECOMUNICACIONES',1);
