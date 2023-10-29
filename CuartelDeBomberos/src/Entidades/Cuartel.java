package Entidades;

public class Cuartel {
    private int codCuartel;
    private String nombreCuartel;
    private Double direccion;
    private String telefono;
    private String mail;

    public Cuartel() {
    }

    public Cuartel(int codCuartel, String nombreCuartel, Double direccion, String telefono, String mail) {
        this.codCuartel = codCuartel;
        this.nombreCuartel = nombreCuartel;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mail = mail;
    }

    public Cuartel(String nombreCuartel, Double direccion, String telefono, String mail) {
        this.nombreCuartel = nombreCuartel;
        this.direccion = direccion;
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

    public Double getDireccion() {
        return direccion;
    }

    public void setDireccion(Double direccion) {
        this.direccion = direccion;
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
        String cuartel= ("Codigo Cuartel: " + codCuartel + "- Nombre del Cuartel: " + nombreCuartel + "- Direccion: " + direccion + "-  Telefono: " + telefono + "- Mail=" + mail);
        return cuartel;
        
    }
}