/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/

package com.uber.views;

import com.uber.controllers.TipoViajeController;
import com.uber.controllers.ViajeController;
import com.uber.models.EstadoViaje;
import com.uber.models.Pasajero;
import com.uber.models.Chofer;
import com.uber.models.TipoViaje;
import com.uber.models.Viaje;

public class PasajeroApp {
    private Pasajero loggedPasajero;
    private Viaje viajeActual;

    private TipoViajeController tipoViajeController;
    private ViajeController viajeController;

    public PasajeroApp(Pasajero loggedPasajero, ViajeController viajeController){
        this.loggedPasajero = loggedPasajero;
        this.tipoViajeController = new TipoViajeController();
        this.viajeController = viajeController;
    }

    public void abrirApp(){
        System.out.println("Abriendo app...");
    }


    public void cerrarApp(){
        System.out.println("Cerrando app...");
    }

    public Viaje seleccionarDestino(String origen, String destino){
        this.viajeActual = this.viajeController.crearViaje(this.loggedPasajero, origen, destino);
        mostrarTarifas();
        return this.viajeActual;
    }

    public void mostrarTarifas(){
        System.out.println("Elige un viaje:");
        System.out.println(this.tipoViajeController.getTarifas());
    }

    public void seleccionarTarifa(String tarifaSeleccionada){
        TipoViaje tipoViajeSeleccionado = this.tipoViajeController.getTarifaByName(tarifaSeleccionada);
        this.viajeController.seleccionarTarifa(tipoViajeSeleccionado);
        System.out.println("Ha seleccionado la tarifa '" + tarifaSeleccionada + "'");
    }

    public void confirmarPedido(){
        System.out.println("Pedido confirmado.");
        System.out.println("Empezando emparejamiento.");
        Chofer choferEmparejado = this.viajeController.emparejarChofer();
        System.out.println("Chofer " + choferEmparejado.getNombreCompletoString() + " ha aceptado el viaje.");
    }

    public void mostrarSeguimiento(){
        // int kmTranscurridos = this.viajeController.consultarKmTranscurridos();
        // int kmChofer = this.viajeController.consultarUbiChofer();
        int kmFaltantesChofer = this.viajeController.consultarUbiChofer();
        while (kmFaltantesChofer!=0) {
            System.out.println("El chofer está a " + kmFaltantesChofer + " km de ti.");
            kmFaltantesChofer = this.viajeController.consultarUbiChofer();
        }

        System.out.println("El chofer te está esperando...");
        // this.viajeController.empezarViajeADestino();


        // int kmFaltantes = this.viajeController.actualizarUbicacion();
        // while (kmFaltantes >= 0) { 
        //     System.out.println("En " + kmFaltantes + " km llegarás a tu destino.");
        //     kmFaltantes = this.viajeController.actualizarUbicacion();
        // }


    }

}