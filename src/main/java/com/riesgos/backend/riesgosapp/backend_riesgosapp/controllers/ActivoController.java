package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Activo;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IActivoService;

@RestController
@RequestMapping("/api/activos")
public class ActivoController {

    @Autowired
    private IActivoService service;

    @GetMapping
    public List<Activo> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Activo create(@RequestBody Activo entity) {
        return service.save(entity);
    }

    @PutMapping
    public Activo update(@RequestBody Activo entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
