package com.uber.models;

public class SeguimientoViaje {
    private int kmTotal;
    private int kmChofer;
    private int kmTranscurridos;

    public SeguimientoViaje(int kmTotal, int kmChofer, int kmTranscurridos){
        this.kmTotal = kmTotal;
        this.kmChofer = kmChofer;
        this.kmTranscurridos = kmTranscurridos;
    }


    public int getKmTotal() {
        return this.kmTotal;
    }

    public void setKmTotal(int kmTotal) {
        this.kmTotal = kmTotal;
    }

    public int getKmChofer() {
        return this.kmChofer;
    }

    public void setKmChofer(int kmChofer) {
        this.kmChofer = kmChofer;
    }

    public int getKmTranscurridos() {
        return this.kmTranscurridos;
    }

    public void setKmTranscurridos(int kmTranscurridos) {
        this.kmTranscurridos = kmTranscurridos;
    }


    public int consultarKmFaltantes(){
        int kmFaltantes = this.kmTotal - this.kmTranscurridos;
        this.kmTranscurridos += 1;
        return kmFaltantes;
    }

    public int consultarKmFaltantesChofer(){
        int kmFaltantes = this.kmChofer - this.kmTranscurridos;
        this.kmTranscurridos += 1;
        return kmFaltantes;
    }

}
