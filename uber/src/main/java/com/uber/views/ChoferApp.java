/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.uber.views;
import java.util.Scanner;

import com.uber.controllers.ViajeController;
import com.uber.models.Chofer;
import com.uber.models.EstadoViaje;
import com.uber.models.Viaje;

public class ChoferApp {
    private Chofer loggedChofer;
    private Viaje viajeActual;
    private ViajeController viajeController;
    private Scanner input = new Scanner(System.in);

    public ChoferApp(Chofer loggedChofer, ViajeController viajeController){
        this.loggedChofer = loggedChofer;
        this.viajeController = viajeController;
    }

    public Chofer getLoggedChofer() {
        return this.loggedChofer;
    }

    public Chofer ofrecerViaje(Viaje viajeOfrecido){
        System.out.println("Ofreciendo viaje desde " + viajeOfrecido.getOrigen() + " hasta " + viajeOfrecido.getDestino());
        this.viajeActual = viajeOfrecido;
        System.out.println("¿Quieres aceptarlo? (ingresar n°)\n1. Si\n2. No");
        String seleccion = input.nextLine();
        if (seleccion.equals("1")) {
            aceptarViaje();
            return this.loggedChofer;
        } else {
            rechazarViaje();
            return null;
        }
    }

    public void aceptarViaje(){
        System.out.println("Aceptando viaje de " + this.viajeActual.getPasajero().getNombreCompletoString());
        this.viajeController.actualizarEstado(EstadoViaje.ACEPTADO); // Acá cambiar por llamada al controlador pasando el nuevo estado
    }

    public void rechazarViaje(){
        System.out.println("Rechazando viaje de " + this.viajeActual.getPasajero().getNombreCompletoString());
    }

}
