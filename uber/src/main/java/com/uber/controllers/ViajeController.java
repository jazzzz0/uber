package com.uber.controllers;

import java.util.ArrayList;
import java.util.List;

import com.uber.models.Chofer;
import com.uber.views.ChoferApp;
import com.uber.models.EstadoViaje;
import com.uber.models.Pasajero;
import com.uber.models.TipoViaje;
import com.uber.models.Viaje;

public class ViajeController {
    private Viaje viajeActual;
    private List<ChoferApp> choferesDisponibles;

    public ViajeController(){
        this.choferesDisponibles = new ArrayList<>();
    }

    public void registrarChoferDisponible(ChoferApp choferDisponible){
        this.choferesDisponibles.add(choferDisponible);
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

    public Chofer emparejarChofer(){
        actualizarEstado(EstadoViaje.EMPAREJANDO);
        Chofer chofer = null;

        while(this.viajeActual.getEstado() == EstadoViaje.EMPAREJANDO){
            // si el chofer acepta, se cambia el estado del viaje
            ChoferApp choferApp = this.choferesDisponibles.get(0);
            if(choferApp.getLoggedChofer().estaTrabajando()){
                // ofrezco viaje
                chofer = choferApp.ofrecerViaje(this.viajeActual);
                if (chofer != null){
                    actualizarEstado(EstadoViaje.ACEPTADO);
                    break;
                }
                this.viajeActual.setChofer(chofer);
            }
        }
        empezarSeguimiento();
        return chofer;
    }

    public void empezarSeguimiento(){
        actualizarEstado(EstadoViaje.CHOFER_EN_CAMINO);
        this.viajeActual.setSeguimiento(10, 3, 0);

    }

    public void empezarViajeADestino(){
        actualizarEstado(EstadoViaje.EN_CURSO);
    }

    public int consultarKmTranscurridos(){
        return this.viajeActual.consultarKmTranscurridos();
    }


    public int consultarUbiChofer(){
        return this.viajeActual.consultarUbiChofer();
    }

    public int actualizarUbicacion(){
        return this.viajeActual.consultarSeguimiento();
    }


    public void completarViaje(){
        actualizarEstado(EstadoViaje.COMPLETADO);
    }

}
