package Entidades;

public class Brigada {
    private int codBrigada;
    private String nombreClave;   
    private String especialidad; 
    private Cuartel cuartel;
    private boolean estadoBrigada;

    public Brigada() {
    }

    public Brigada(int codBrigada, String nombreClave, String especialidad, Cuartel cuartel, boolean estadoBrigada) {
        this.codBrigada = codBrigada;
        this.nombreClave = nombreClave;
        this.especialidad = especialidad;
        this.cuartel = cuartel;
        this.estadoBrigada = estadoBrigada;
    }

    public Brigada(String nombreClave, String especialidad, Cuartel cuartel, boolean estadoBrigada) {
        this.nombreClave = nombreClave;
        this.especialidad = especialidad;
        this.cuartel = cuartel;
        this.estadoBrigada = estadoBrigada;
    }

    
    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Cuartel getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }

    public boolean isEstadoBrigada() {
        return estadoBrigada;
    }

    public void setEstadoBrigada(boolean estadoBrigada) {
        this.estadoBrigada = estadoBrigada;
    }

    @Override
    public String toString() {
        return(codBrigada + "-" + nombreClave + "-" + especialidad);
         
    }    
}
