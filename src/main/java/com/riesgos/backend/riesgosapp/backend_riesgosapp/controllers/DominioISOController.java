package com.riesgos.backend.riesgosapp.backend_riesgosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.DominioISO;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IDominioISOService;

@RestController
@RequestMapping("/api/dominio-isos")
public class DominioISOController {

    @Autowired
    private IDominioISOService service;

    @GetMapping
    public List<DominioISO> getAll() {
        return service.findAll();
    }

    @PostMapping
    public DominioISO create(@RequestBody DominioISO entity) {
        return service.save(entity);
    }

    @PutMapping
    public DominioISO update(@RequestBody DominioISO entity) {
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
