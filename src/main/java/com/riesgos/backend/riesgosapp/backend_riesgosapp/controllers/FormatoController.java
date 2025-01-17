package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Formato;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IFormatoService;

@RestController
@RequestMapping("/api/formatos")
public class FormatoController {

    @Autowired
    private IFormatoService service;

    @GetMapping
    public List<Formato> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Formato create(@RequestBody Formato entity) {
        return service.save(entity);
    }

    @PutMapping
    public Formato update(@RequestBody Formato entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
