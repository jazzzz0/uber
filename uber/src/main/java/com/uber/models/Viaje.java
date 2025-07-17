package com.uber.models;

public class Viaje {
    private Pasajero pasajero;
    private Chofer chofer;
    private String origen;
    private String destino;
    private TipoViaje tipoViaje;
    private EstadoViaje estado;
    private SeguimientoViaje seguimiento;
    private CalificacionViaje calificacion;

    public Viaje(Pasajero pasajero, String origen, String destino){
        this.pasajero = pasajero;
        this.origen = origen;
        this.destino = destino;
        this.estado = null;
        this.chofer = null;
        this.seguimiento = null;
        this.calificacion= null;
    }

    public void setTipoViaje(TipoViaje tipoViaje){
        this.tipoViaje = tipoViaje;
    }

    public Pasajero getPasajero(){
        return this.pasajero;
    }
    
    public EstadoViaje getEstado(){
        return this.estado;
    }

    public void setEstado(EstadoViaje estado){
        this.estado = estado;
    }

    public String getOrigen() {
        return this.origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setChofer(Chofer chofer){
        this.chofer = chofer;
    }

    public void setSeguimiento(int kmTotal, int kmChofer, int kmTranscurridos){
        this.seguimiento = new SeguimientoViaje(kmTotal, kmChofer, kmTranscurridos);
    }

    public int consultarKmTranscurridos(){
        return this.seguimiento.getKmTranscurridos();
    }

    public int consultarUbiChofer(){
        return this.seguimiento.consultarKmFaltantesChofer();
    }

    public int consultarSeguimiento() {
        return this.seguimiento.consultarKmFaltantes();
    }
    public void setCalificacion(int calificacion, String comentario) {
        this.calificacion = new CalificacionViaje(calificacion, comentario);
        
    }
}