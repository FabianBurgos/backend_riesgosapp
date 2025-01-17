package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ClasificacionActivo;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IClasificacionActivoService;

@RestController
@RequestMapping("/api/clasificacion-activos")
public class ClasificacionActivoController {

    @Autowired
    private IClasificacionActivoService service;

    @GetMapping
    public List<ClasificacionActivo> getAll() {
        return service.findAll();
    }

    @PostMapping
    public ClasificacionActivo create(@RequestBody ClasificacionActivo entity) {
        return service.save(entity);
    }

    @PutMapping
    public ClasificacionActivo update(@RequestBody ClasificacionActivo entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
