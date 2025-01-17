package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Evento;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IEventoService;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    @Autowired
    private IEventoService service;

    @GetMapping
    public List<Evento> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Evento create(@RequestBody Evento entity) {
        return service.save(entity);
    }

    @PutMapping
    public Evento update(@RequestBody Evento entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
