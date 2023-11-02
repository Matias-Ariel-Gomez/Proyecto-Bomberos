package Entidades;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Siniestro {
    private int codSiniestro;
    private int calleS;
    private int alturaS;
    private LocalDate fechaSiniestro;
    private LocalTime hora = LocalTime.now();
    private String tipo;
    private String detalle;
    private LocalDate fechaResolucion;
    private int puntuacion;
    private Brigada brigada;
    private boolean estadoSiniestro;

    public Siniestro() {
    }

    public Siniestro(int codSiniestro, int calleS, int alturaS, LocalDate fechaSiniestro, LocalTime hora, String tipo, String detalle, LocalDate fechaResolucion, int puntuacion, boolean estadoSiniestro) {
        this.codSiniestro = codSiniestro;
        this.calleS = calleS;
        this.alturaS = alturaS;
        this.fechaSiniestro = fechaSiniestro;
        this.hora=hora;
        this.tipo = tipo;
        this.detalle = detalle;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.estadoSiniestro = estadoSiniestro;
    }

    public Siniestro(int calleS, int alturaS, LocalDate fechaSiniestro, LocalTime  hora, String tipo, String detalle, LocalDate fechaResolucion, int puntuacion, boolean estadoSiniestro) {
        this.calleS = calleS;
        this.alturaS = alturaS;
        this.fechaSiniestro = fechaSiniestro;
        this.hora=hora;
        this.tipo = tipo;
        this.detalle = detalle;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.estadoSiniestro = estadoSiniestro;
    }

    public Siniestro(int calleS, int alturaS, LocalDate fechaSiniestro, LocalTime hora, String tipo, String detalle, Brigada brigada, boolean estadoSiniestro) {
        this.calleS = calleS;
        this.alturaS = alturaS;
        this.fechaSiniestro = fechaSiniestro;
        this.hora=hora;
        this.tipo = tipo;
        this.detalle = detalle;
        this.brigada = brigada;
        this.estadoSiniestro = estadoSiniestro;
    }

    public int getCodSiniestro() {
        return codSiniestro;
    }

    public void setCodSiniestro(int codSiniestro) {
        this.codSiniestro = codSiniestro;
    }

    public int getCalleS() {
        return calleS;
    }

    public void setCalleS(int calleS) {
        this.calleS = calleS;
    }

    public int getAlturaS() {
        return alturaS;
    }

    public void setAlturaS(int alturaS) {
        this.alturaS = alturaS;
    }

    public LocalDate getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(LocalDate fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    public boolean isEstadoSiniestro() {
        return estadoSiniestro;
    }

    public void setEstadoSiniestro(boolean estadoSiniestro) {
        this.estadoSiniestro = estadoSiniestro;
    }
    
    @Override
    public String toString() {
        return (codSiniestro + " " + calleS + " " + alturaS + " " + fechaSiniestro + ", hora=" + hora + " " + tipo + " " + detalle + " " + fechaResolucion + " " + puntuacion);
    }  
    
//    public double dSiniestro(){
//        
//        double calle = calleS*calleS;
//        double altura=alturaS*alturaS;
//        
//        double dist1= Math.sqrt(calle + altura);
//       
//        return dist1;
//    }
}
