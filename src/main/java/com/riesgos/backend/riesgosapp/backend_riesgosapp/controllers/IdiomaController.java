package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Idioma;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IIdiomaService;

@RestController
@RequestMapping("/api/idiomas")
public class IdiomaController {

    @Autowired
    private IIdiomaService service;

    @GetMapping
    public List<Idioma> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Idioma create(@RequestBody Idioma entity) {
        return service.save(entity);
    }

    @PutMapping
    public Idioma update(@RequestBody Idioma entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
