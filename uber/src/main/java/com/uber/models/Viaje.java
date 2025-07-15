package com.uber.models;

public class Viaje {
    private Pasajero pasajero;
    private Chofer chofer;
    private String origen;
    private String destino;
    // destino
    private TipoViaje tipoViaje;
    private EstadoViaje estado;

    public Viaje(Pasajero pasajero, String origen, String destino){
        this.pasajero = pasajero;
        this.origen = origen;
        this.destino = destino;
        this.estado = null;
        this.chofer = null;
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
}