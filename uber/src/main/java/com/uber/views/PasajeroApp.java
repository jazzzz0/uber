/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/

package com.uber.views;

import java.util.List;

import com.uber.controllers.TipoViajeController;
import com.uber.models.Pasajero;
import com.uber.models.TipoViaje;
import com.uber.models.Viaje;

public class PasajeroApp {
    private Pasajero loggedPasajero;
    private Viaje viajeActual;

    private TipoViajeController tipoViajeController;

    public PasajeroApp(Pasajero loggedPasajero, TipoViajeController tipoViajeController){
        this.loggedPasajero = loggedPasajero;
        this.tipoViajeController = tipoViajeController;
    }

    public void abrirApp(){
        System.out.println("Abriendo app...");
    }


    public void cerrarApp(){
        System.out.println("Cerrando app...");
    }

    public Viaje seleccionarDestino(String origen, String destino){
        Viaje viaje = new Viaje(this.loggedPasajero, origen, destino);
        this.viajeActual = viaje;
        mostrarTarifas();
        return this.viajeActual;
    }

    public void mostrarTarifas(){
        System.out.println("Elige un viaje:");
        System.out.println(this.tipoViajeController.getTarifas());
    }

    public void seleccionarTarifa(String tarifaSeleccionada){
        TipoViaje tipoViajeSeleccionado = this.tipoViajeController.getTarifaByName(tarifaSeleccionada);
        this.viajeActual.setTipoViaje(tipoViajeSeleccionado);
    }

    public void confirmarPedido(){
        emparejarChofer();
    }

}