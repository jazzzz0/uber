package com.uber.models;

public class Viaje {
    private Pasajero pasajero;
    // chofer
    private String origen;
    private String destino;
    // destino
    private TipoViaje tipoViaje;
    // estadoViaje

    public Viaje(Pasajero pasajero, String origen, String destino){
        this.pasajero = pasajero;
        this.origen = origen;
        this.destino = destino;
    }

    public void setTipoViaje(TipoViaje tipoViaje){
        this.tipoViaje = tipoViaje;
    }
}