package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ContextoExterno;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IContextoExternoService;

@RestController
@RequestMapping("/api/contexto-externos")
public class ContextoExternoController {

    @Autowired
    private IContextoExternoService service;

    @GetMapping
    public List<ContextoExterno> getAll() {
        return service.findAll();
    }

    @PostMapping
    public ContextoExterno create(@RequestBody ContextoExterno entity) {
        return service.save(entity);
    }

    @PutMapping
    public ContextoExterno update(@RequestBody ContextoExterno entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
