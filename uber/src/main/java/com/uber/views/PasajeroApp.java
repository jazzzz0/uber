/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.uber.views;

import com.uber.controllers.TipoViajeController;
import com.uber.models.Pasajero;
import com.uber.models.Viaje;

public class PasajeroApp {
    private Pasajero loggedPasajero;
    private Viaje viajeActual;

    private TipoViajeController tipoViajeController;

    public PasajeroApp(Pasajero loggedPasajero){
        this.loggedPasajero = loggedPasajero;
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
        this.tipoViajeController.getTarifas();
    }

    // mostrarTarifa -> TipoViajeController -> TipoViaje
    
    public void seleccionarTarifa(){}

}
