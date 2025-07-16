package com.uber;

import com.uber.controllers.TipoViajeController;
import com.uber.controllers.ViajeController;
import com.uber.models.Chofer;
import com.uber.models.EstadoViaje;
import com.uber.models.Pasajero;
import com.uber.models.Viaje;
import com.uber.views.ChoferApp;
import com.uber.views.PasajeroApp;


public class UberFlow {
    public static void main(String[] args) {
        // Se prepara el entorno para el comienzo del caso de uso
        Pasajero yamilaMorais = new Pasajero("Yamila", "Morais", 3333, "chamu@chamu.com.ar", "1234", 1234);

        Chofer carlosGarcia = new Chofer("Carlos", "Garcia", 12345, "carlos@carlos.com.ar", "password", 4321, true);

        ViajeController viajeController = new ViajeController();

        // apps: qué pueden hacer los usuarios
        PasajeroApp pasajeroApp = new PasajeroApp(yamilaMorais, viajeController);
        ChoferApp choferApp = new ChoferApp(carlosGarcia, viajeController);

        // Comienza el flujo del caso de uso
        // abro app 
        pasajeroApp.abrirApp();

        // selecciono inicio y destino
        Viaje viaje = pasajeroApp.seleccionarDestino("Los Pozos 123","Rivadavia 123"); 

        // elijo tarifa
        pasajeroApp.seleccionarTarifa("Uber X");

        // confirmo pedido
        pasajeroApp.confirmarPedido();

        // empieza viaje y seguimiento
        pasajeroApp.mostrarSeguimiento();
        choferApp.empezarViajeADestino();

        // termina viaje
        choferApp.completarViaje();
        
        // calificacion
        

        // comentar
        
        // envia
        
        // cerrar app;

    }

}