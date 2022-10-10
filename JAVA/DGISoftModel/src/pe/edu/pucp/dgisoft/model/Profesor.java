
package pe.edu.pucp.dgisoft.model;

public class Profesor extends MiembroPUCP{
    private String categoria;
    private boolean activo;
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
