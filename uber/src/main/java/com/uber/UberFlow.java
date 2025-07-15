package com.uber;

import com.uber.controllers.TipoViajeController;
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
        // bucle buscando chofer, hasta que uno acepte (si hubiera muchos choferes, acá solo uno)
        while(viaje.getEstado() == EstadoViaje.EMPAREJANDO){
            // si el chofer acepta, se cambia el estado del viaje
            if(choferApp.getLoggedChofer().estaTrabajando()){
                // ofrezco viaje
                choferApp.ofrecerViaje(viaje);
                System.out.println("Chofer " + choferApp.getLoggedChofer().getNombreCompletoString() + " ha aceptado el viaje.");
                break;
            }
        }

        // Controlador de viaje, devuelva el chofer que acepta el viaje
        // Hacer controladores que interactúen con las vistas y manejen el flujo de cambiar el estado de viajes 
        // la interacción entre choferes y pasajeros


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