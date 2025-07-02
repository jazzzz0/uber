package com.uber.repo;

import java.util.ArrayList;
import java.util.List;

import com.uber.models.TipoViaje;

public class TipoViajeRepo {

    List<TipoViaje> tiposViaje = new ArrayList<>();

    public TipoViajeRepo() {
        TipoViaje comfort = new TipoViaje("Comfort", 5000);
        TipoViaje uberX = new TipoViaje("Uber X", 4000);
        TipoViaje flash = new TipoViaje("Flash", 3000);

        this.tiposViaje.add(comfort);
        this.tiposViaje.add(uberX);
        this.tiposViaje.add(flash);
    }

    public List<TipoViaje> getTarifas() {
        return tiposViaje;
    }

    public TipoViaje getTarifaByName(String query) {
        return tiposViaje.stream()
            .filter(tipoViaje -> tipoViaje.getNombre().contains(query))
            .findFirst()
            .orElse(tiposViaje.get(0));
    }

}