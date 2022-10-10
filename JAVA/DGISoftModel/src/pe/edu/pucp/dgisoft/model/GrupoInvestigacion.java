package pe.edu.pucp.dgisoft.model;

import java.util.ArrayList;

public class GrupoInvestigacion {
    private int idGrupoInvestigacion;
    private ArrayList<MiembroPUCP> integrantes;
    private Seccion seccion;
    private String nombre;
    private String siglas;
    private String anhoFundacion;
    private boolean interdisciplinario;
    private String descripcion;
    private byte[] foto;
    private byte[] archivoAdicionalPDF;
    private boolean activo;

    public int getIdGrupoInvestigacion() {
        return idGrupoInvestigacion;
    }

    public void setIdGrupoInvestigacion(int idGrupoInvestigacion) {
        this.idGrupoInvestigacion = idGrupoInvestigacion;
    }

    public ArrayList<MiembroPUCP> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<MiembroPUCP> integrantes) {
        this.integrantes = integrantes;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getAnhoFundacion() {
        return anhoFundacion;
    }

    public void setAnhoFundacion(String anhoFundacion) {
        this.anhoFundacion = anhoFundacion;
    }

    public boolean isInterdisciplinario() {
        return interdisciplinario;
    }

    public void setInterdisciplinario(boolean interdisciplinario) {
        this.interdisciplinario = interdisciplinario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public byte[] getArchivoAdicionalPDF() {
        return archivoAdicionalPDF;
    }

    public void setArchivoAdicionalPDF(byte[] archivoAdicionalPDF) {
        this.archivoAdicionalPDF = archivoAdicionalPDF;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
