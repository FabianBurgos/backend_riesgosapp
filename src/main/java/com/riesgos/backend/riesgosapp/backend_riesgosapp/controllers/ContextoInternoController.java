package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ContextoInterno;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IContextoInternoService;

@RestController
@RequestMapping("/api/contexto-internos")
public class ContextoInternoController {

    @Autowired
    private IContextoInternoService service;

    @GetMapping
    public List<ContextoInterno> getAll() {
        return service.findAll();
    }

    @PostMapping
    public ContextoInterno create(@RequestBody ContextoInterno entity) {
        return service.save(entity);
    }

    @PutMapping
    public ContextoInterno update(@RequestBody ContextoInterno entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
