package com.uber.repo;

import java.util.ArrayList;
import java.util.List;

import com.uber.models.TipoViaje;

public class TipoViajeRepo{
    List<TipoViaje> tiposViaje = new ArrayList<>();

    public TipoViajeRepo(){
        TipoViaje comfort = new TipoViaje("Comfort", 5000);
        TipoViaje uberX = new TipoViaje("Uber X", 4000);
        TipoViaje flash = new TipoViaje("Flash", 3000);

        this.tiposViaje.add(comfort);
        this.tiposViaje.add(uberX);
        this.tiposViaje.add(flash);
    }
    public List<TipoViaje> getTarifas(){
        return tiposViaje;
    }

}
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


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", tarifa='" + getTarifa() + "'" +
            "}";
    }

}