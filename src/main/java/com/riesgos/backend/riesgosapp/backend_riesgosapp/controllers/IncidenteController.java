package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Incidente;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IIncidenteService;

@RestController
@RequestMapping("/api/incidentes")
public class IncidenteController {

    @Autowired
    private IIncidenteService service;

    @GetMapping
    public List<Incidente> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Incidente create(@RequestBody Incidente entity) {
        return service.save(entity);
    }

    @PutMapping
    public Incidente update(@RequestBody Incidente entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}

