package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Tratamiento;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.ITratamientoService;

@RestController
@RequestMapping("/api/tratamientos")
public class TratamientoController {

    @Autowired
    private ITratamientoService service;

    @GetMapping
    public List<Tratamiento> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Tratamiento create(@RequestBody Tratamiento entity) {
        return service.save(entity);
    }

    @PutMapping
    public Tratamiento update(@RequestBody Tratamiento entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
