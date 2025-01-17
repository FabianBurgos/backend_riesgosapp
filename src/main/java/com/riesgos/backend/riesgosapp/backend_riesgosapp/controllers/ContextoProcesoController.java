package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ContextoProceso;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IContextoProcesoService;

@RestController
@RequestMapping("/api/contexto-procesos")
public class ContextoProcesoController {

    @Autowired
    private IContextoProcesoService service;

    @GetMapping
    public List<ContextoProceso> getAll() {
        return service.findAll();
    }

    @PostMapping
    public ContextoProceso create(@RequestBody ContextoProceso entity) {
        return service.save(entity);
    }

    @PutMapping
    public ContextoProceso update(@RequestBody ContextoProceso entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
