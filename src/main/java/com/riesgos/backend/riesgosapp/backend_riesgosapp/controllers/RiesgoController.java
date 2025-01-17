package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Riesgo;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IRiesgoService;

@RestController
@RequestMapping("/api/riesgos")
public class RiesgoController {

    @Autowired
    private IRiesgoService service;

    @GetMapping
    public List<Riesgo> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Riesgo create(@RequestBody Riesgo entity) {
        return service.save(entity);
    }

    @PutMapping
    public Riesgo update(@RequestBody Riesgo entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
