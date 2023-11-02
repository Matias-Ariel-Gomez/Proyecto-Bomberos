package Entidades;

public class Cuartel {
    private int codCuartel;
    private String nombreCuartel;
    private int calleC;
    private int alturaC;    
    private String telefono;
    private String mail;

    public Cuartel() {
    }

    public Cuartel(int codCuartel, String nombreCuartel, int calleC, int alturaC, String telefono, String mail) {
        this.codCuartel = codCuartel;
        this.nombreCuartel = nombreCuartel;
        this.calleC = calleC;
        this.alturaC = alturaC;
        this.telefono = telefono;
        this.mail = mail;
    }

    public Cuartel(String nombreCuartel, int calleC, int alturaC, String telefono, String mail) {
        this.nombreCuartel = nombreCuartel;
        this.calleC = calleC;
        this.alturaC= alturaC;
        this.telefono = telefono;
        this.mail = mail;
    }

    public int getCodCuartel() {
        return codCuartel;
    }

    public void setCodCuartel(int codCuartel) {
        this.codCuartel = codCuartel;
    }

    public String getNombreCuartel() {
        return nombreCuartel;
    }

    public void setNombreCuartel(String nombreCuartel) {
        this.nombreCuartel = nombreCuartel;
    }

    public int getCalleC() {
        return calleC;
    }

    public void setCalleC(int calleC) {
        this.calleC = calleC;
    }

    public int getAlturaC() {
        return alturaC;
    }

    public void setAlturaC(int alturaC) {
        this.alturaC = alturaC;  
    }   

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return (codCuartel + "-" +  nombreCuartel);
        
    }
}