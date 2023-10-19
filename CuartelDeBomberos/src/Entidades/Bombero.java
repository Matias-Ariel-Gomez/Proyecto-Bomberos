package Entidades;
import java.time.LocalDate;
import Entidades.Brigada;

public class Bombero {
    private int codBombero;
    private String dni;
    private String nombreCompleto;    
    private String grupoSanguineo;
    private LocalDate fechaNacimiento;
    private String telCelular;   
    private Brigada brigada;
    private boolean estadoBombero;

    public Bombero() {
    }

    public Bombero(int codBombero, String dni, String nombreCompleto, String grupoSanguineo, LocalDate fechaNacimiento, String telCelular, Brigada brigada, boolean estadoBombero) {
        this.codBombero = codBombero;
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.grupoSanguineo = grupoSanguineo;
        this.fechaNacimiento = fechaNacimiento;
        this.telCelular = telCelular;
        this.brigada = brigada;
        this.estadoBombero = estadoBombero;
    }

    public Bombero(String dni, String nombreCompleto, String grupoSanguineo, LocalDate fechaNacimiento, String telCelular, Brigada brigada, boolean estadoBombero) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.grupoSanguineo = grupoSanguineo;
        this.fechaNacimiento = fechaNacimiento;
        this.telCelular = telCelular;
        this.brigada = brigada;
        this.estadoBombero = estadoBombero;
    }

    public Bombero(String dni, String nombreCompleto, String grupoSanguineo, LocalDate fechaNacimiento, String telCelular, int brigada, Boolean estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Bombero(String dni, String nombreCompleto, String grupoSanguineo, LocalDate fechaNacimiento, String telCelular, String brigada, Boolean estadoBombero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodBombero() {
        return codBombero;
    }

    public void setCodBombero(int codBombero) {
        this.codBombero = codBombero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    public boolean isEstadoBombero() {
        return estadoBombero;
    }

    public void setEstadoBombero(boolean estadoBombero) {
        this.estadoBombero = estadoBombero;
    }

    @Override
    public String toString() {
        return "Bombero{" + "codBombero=" + codBombero + ", dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", grupoSanguineo=" + grupoSanguineo + ", fechaNacimiento=" + fechaNacimiento + ", telCelular=" + telCelular + ", brigada=" + brigada + ", estadoBombero=" + estadoBombero + '}';
    }

    public void setBrigada(String brigada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setBrigada(int brigada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    
    
}
