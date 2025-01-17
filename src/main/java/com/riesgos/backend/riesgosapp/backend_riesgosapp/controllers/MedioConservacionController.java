package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.MedioConservacion;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IMedioConservacionService;

@RestController
@RequestMapping("/api/medio-conservacions")
public class MedioConservacionController {

    @Autowired
    private IMedioConservacionService service;

    @GetMapping
    public List<MedioConservacion> getAll() {
        return service.findAll();
    }

    @PostMapping
    public MedioConservacion create(@RequestBody MedioConservacion entity) {
        return service.save(entity);
    }

    @PutMapping
    public MedioConservacion update(@RequestBody MedioConservacion entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
