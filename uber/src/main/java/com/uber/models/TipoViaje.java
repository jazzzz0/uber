package com.uber.models;

public class TipoViaje {
    String nombre;
    float tarifa;

    public TipoViaje(String nombre, float tarifa){
        this.nombre = nombre;
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return this.nombre;
    }

    public float getTarifa() {
        return this.tarifa;
    }

}
