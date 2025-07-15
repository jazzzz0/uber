package com.uber.models;

public class Chofer extends Usuario{
    private boolean estaTrabajando;
    // private List<Viaje> historialViajes;

    public Chofer(String nombre, String apellido, int dni, String correo, String password, int telefono, boolean estaTrabajando) {
        super(nombre, apellido, dni, correo, password, telefono);
        this.estaTrabajando = estaTrabajando;
    }


    public void setTrabajando(boolean estaTrabajando) {
        this.estaTrabajando = estaTrabajando;
    }

    public boolean estaTrabajando(){
        return this.estaTrabajando;
    }

}
