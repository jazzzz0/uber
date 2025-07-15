package com.uber.models;

public class Usuario {
    private String nombre;
    private String apellido;
    private int dni;
    private String correo;
    private String password;
    private int telefono;
    public Usuario(String nombre, String apellido, int dni, String correo, String password, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
    }

    public String getNombreCompletoString() {
        return this.nombre + " " + this.apellido;
    }

}
