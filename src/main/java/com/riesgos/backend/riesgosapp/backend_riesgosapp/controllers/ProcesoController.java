package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Proceso;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IProcesoService;

@RestController
@RequestMapping("/api/procesos")
public class ProcesoController {

    @Autowired
    private IProcesoService service;

    @GetMapping
    public List<Proceso> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Proceso create(@RequestBody Proceso entity) {
        return service.save(entity);
    }

    @PutMapping
    public Proceso update(@RequestBody Proceso entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
