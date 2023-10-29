package Entidades;
import Entidades.Brigada;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Siniestro {
    private int codSiniestro;
    private Double direccionSiniestro;
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

    public Siniestro(int codSiniestro, Double direccionSiniestro, LocalDate fechaSiniestro, LocalTime hora, String tipo, String detalle, LocalDate fechaResolucion, int puntuacion, Brigada brigada, boolean estadoSiniestro) {
        this.codSiniestro = codSiniestro;
        this.direccionSiniestro = direccionSiniestro;
        this.fechaSiniestro = fechaSiniestro;
        this.hora = hora;
        this.tipo = tipo;
        this.detalle = detalle;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.brigada = brigada;
        this.estadoSiniestro = estadoSiniestro;
    }

    public Siniestro(Double direccionSiniestro, LocalDate fechaSiniestro, LocalTime hora, String tipo, String detalle, LocalDate fechaResolucion, int puntuacion, Brigada brigada, boolean estadoSiniestro) {
        this.direccionSiniestro = direccionSiniestro;
        this.fechaSiniestro = fechaSiniestro;
        this.hora = hora;
        this.tipo = tipo;
        this.detalle = detalle;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.brigada = brigada;
        this.estadoSiniestro = estadoSiniestro;
    }

    public int getCodSiniestro() {
        return codSiniestro;
    }

    public void setCodSiniestro(int codSiniestro) {
        this.codSiniestro = codSiniestro;
    }

    public Double getDireccionSiniestro() {
        return direccionSiniestro;
    }

    public void setDireccionSiniestro(Double direccionSiniestro) {
        this.direccionSiniestro = direccionSiniestro;
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
        String siniestro=(" Codigo del Siniestro: " + codSiniestro + "- Dirección: " + direccionSiniestro + "- Fecha del Siniestro: " + fechaSiniestro + "-  Hora:" + hora + "- Tipo: " + tipo + "- Detalle: " + detalle + "- Fecha de Resolucion: " + fechaResolucion + "-  Puntuacion: " + puntuacion + "- Brigada: " + brigada.getCodBrigada() + "- Estado: " + estadoSiniestro);
        return siniestro;
    }

  
    
    
}
