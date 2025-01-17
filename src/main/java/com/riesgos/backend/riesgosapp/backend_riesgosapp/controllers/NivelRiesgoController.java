package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.NivelRiesgo;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.INivelRiesgoService;

@RestController
@RequestMapping("/api/nivel-riesgos")
public class NivelRiesgoController {

    @Autowired
    private INivelRiesgoService service;

    @GetMapping
    public List<NivelRiesgo> getAll() {
        return service.findAll();
    }

    @PostMapping
    public NivelRiesgo create(@RequestBody NivelRiesgo entity) {
        return service.save(entity);
    }

    @PutMapping
    public NivelRiesgo update(@RequestBody NivelRiesgo entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
