/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.uber.views;
import com.uber.models.Chofer;
import com.uber.models.EstadoViaje;
import com.uber.models.Viaje;

public class ChoferApp {
    private Chofer loggedChofer;
    private Viaje viajeActual;

    public ChoferApp(Chofer loggedChofer){
        this.loggedChofer = loggedChofer;
    }

    public Chofer getLoggedChofer() {
        return this.loggedChofer;
    }

    public void ofrecerViaje(Viaje viajeOfrecido){
        System.out.println("Ofreciendo viaje desde " + viajeOfrecido.getOrigen() + " hasta " + viajeOfrecido.getDestino());
        this.viajeActual = viajeOfrecido;
    }

    public void aceptarViaje(){
        System.out.println("Aceptando viaje de " + this.viajeActual.);
        this.viajeActual.setEstado(EstadoViaje.ACEPTADO);
    }

}
