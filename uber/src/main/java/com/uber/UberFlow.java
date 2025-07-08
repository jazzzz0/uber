package com.uber;

import java.util.ArrayList;
import java.util.List;

import com.uber.controllers.TipoViajeController;
import com.uber.models.Chofer;
import com.uber.models.Pasajero;
import com.uber.models.Viaje;
import com.uber.views.PasajeroApp;
import com.uber.views.ChoferApp;

public class UberFlow {
    public static void main(String[] args) {
        // Se prepara el entorno para el comienzo del caso de uso
        Pasajero yamilaMorais = new Pasajero("Yamila", "Morais", 3333, "chamu@chamu.com.ar", "1234", 1234);

        List<String> zonaChofer = new ArrayList<>(); 
        zonaChofer.add("Ituzaingó");
        zonaChofer.add("Morón");
        zonaChofer.add("Merlo");
        Chofer carlosGarcia = new Chofer("Carlos", "Garcia", 12345, "carlos@carlos.com.ar", "password", 4321, zonaChofer, true);

        // apps: qué pueden hacer los usuarios
        TipoViajeController tipoViajeController = new TipoViajeController();
        PasajeroApp pasajeroApp = new PasajeroApp(yamilaMorais, tipoViajeController);
        ChoferApp choferApp = new ChoferApp(carlosGarcia);


        // Comienza el flujo del caso de uso
        // abro app 
        pasajeroApp.abrirApp();

        // selecciono inicio y destino
        Viaje viaje = pasajeroApp.seleccionarDestino("Los Pozos 123","Rivadavia 123"); 

        // elijo tarifa
        pasajeroApp.seleccionarTarifa("Uber X");


        // confirmo pedido
        pasajeroApp.confirmarPedido();

        // emparejamiento chofer





        // chofer acepta
        // empieza viaje y seguimiento
        // actualizar ubicacion chofer, hasta cambiar estado a "finalizado" ENUM
        // termina viaje
        // calificacion
        // comentar
        // envia
        // cerrar app;

    }

}