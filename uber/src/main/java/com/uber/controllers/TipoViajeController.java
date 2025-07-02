package com.uber.controllers;

import java.util.List;

import com.uber.models.TipoViaje;
import com.uber.repo.TipoViajeRepo;

public class TipoViajeController {
    TipoViajeRepo repo;

    public TipoViajeController(){
        this.repo = new TipoViajeRepo();
    }

    public List<TipoViaje> getTarifas() {
        return this.repo.getTarifas();
    }

    public TipoViaje getTarifaByName(String query) {
        return this.repo.getTarifaByName(query);
    }
}

