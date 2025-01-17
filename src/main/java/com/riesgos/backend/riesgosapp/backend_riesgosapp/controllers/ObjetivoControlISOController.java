package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ObjetivoControlISO;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IObjetivoControlISOService;

@RestController
@RequestMapping("/api/objetivo-control-isos")
public class ObjetivoControlISOController {

    @Autowired
    private IObjetivoControlISOService service;

    @GetMapping
    public List<ObjetivoControlISO> getAll() {
        return service.findAll();
    }

    @PostMapping
    public ObjetivoControlISO create(@RequestBody ObjetivoControlISO entity) {
        return service.save(entity);
    }

    @PutMapping
    public ObjetivoControlISO update(@RequestBody ObjetivoControlISO entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
