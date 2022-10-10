package pe.edu.pucp.dgisoft.model;

public class Alumno extends MiembroPUCP{
    private double CRAEST;
    private boolean activo;

    public double getCRAEST() {
        return CRAEST;
    }

    public void setCRAEST(double CRAEST) {
        this.CRAEST = CRAEST;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
