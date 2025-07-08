package com.uber.models;

import com.uber.models.EstadoViaje;

public class Viaje {
    private Pasajero pasajero;
    // chofer
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
    }

    public void setTipoViaje(TipoViaje tipoViaje){
        this.tipoViaje = tipoViaje;
    }

    public void emparejarChofer(){
        // bucle buscando chofer, hasta que uno acepte 
    }


}