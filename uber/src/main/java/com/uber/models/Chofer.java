package com.uber.models;

import java.util.List;

public class Chofer extends Usuario{
    private List<String> zonaTrabajo;
    private boolean estaTrabajando;
    // private List<Viaje> historialViajes;

    public Chofer(String nombre, String apellido, int dni, String correo, String password, int telefono, List<String> zonaTrabajo, boolean estaTrabajando) {
        super(nombre, apellido, dni, correo, password, telefono);
        this.zonaTrabajo = zonaTrabajo;
        this.estaTrabajando = estaTrabajando;
    }

}
