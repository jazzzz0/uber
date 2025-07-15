package com.uber.controllers;

import com.uber.models.Chofer;
import com.uber.models.EstadoViaje;
import com.uber.models.Pasajero;
import com.uber.models.TipoViaje;
import com.uber.models.Viaje;

public class ViajeController {
    private Viaje viajeActual;
    public ViajeController(){
    }

    public void actualizarEstado(EstadoViaje estadoNuevo){
        this.viajeActual.setEstado(estadoNuevo);
    }

    public Viaje crearViaje(Pasajero pasajero, String origen, String destino){
        this.viajeActual = new Viaje(pasajero, origen, destino);
        return this.viajeActual;
    }

    public void seleccionarTarifa(TipoViaje tipoViajeSeleccionado){
        this.viajeActual.setTipoViaje(tipoViajeSeleccionado);
    }

    public void emparejarChofer(){

        // Cómo hacemos para que conozca al chofer así le puede ofrecer el viaje?
        // Existe la forma sin hacer ChoferRepo?

        while(this.viajeActual.getEstado() == EstadoViaje.EMPAREJANDO){
            // si el chofer acepta, se cambia el estado del viaje
            if(choferApp.getLoggedChofer().estaTrabajando()){
                // ofrezco viaje
                Chofer chofer = choferApp.ofrecerViaje(this.viajeActual);
                this.viajeActual.setChofer(chofer);
                // System.out.println("Chofer " + choferApp.getLoggedChofer().getNombreCompletoString() + " ha aceptado el viaje.");
            }
        }

        // this.viajeActual.setChofer() = new Chofer("","",1,"","",1, true);
        // return new Chofer();
    }

}
