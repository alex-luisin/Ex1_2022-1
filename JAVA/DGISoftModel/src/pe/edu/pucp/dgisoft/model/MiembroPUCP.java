package pe.edu.pucp.dgisoft.model;

import java.util.Date;

public class MiembroPUCP {
    private int idMiembroPUCP;
    private char tipoMiembro;
    private String codigoPUCP;
    private String DNI;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private char genero;
    private Date fechaNacimiento;

    public int getIdMiembroPUCP() {
        return idMiembroPUCP;
    }

    public void setIdMiembroPUCP(int idMiembroPUCP) {
        this.idMiembroPUCP = idMiembroPUCP;
    }

    public char getTipoMiembro() {
        return tipoMiembro;
    }

    public void setTipoMiembro(char tipoMiembro) {
        this.tipoMiembro = tipoMiembro;
    }

    public String getCodigoPUCP() {
        return codigoPUCP;
    }

    public void setCodigoPUCP(String codigoPUCP) {
        this.codigoPUCP = codigoPUCP;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
