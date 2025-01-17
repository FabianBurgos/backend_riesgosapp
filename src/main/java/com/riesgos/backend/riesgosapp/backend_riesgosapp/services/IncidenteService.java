
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Incidente;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.IncidenteRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IIncidenteService;

@Service
public class IncidenteService implements IIncidenteService {
    
    @Autowired
    private IncidenteRepository repository;

    @Override
    public List<Incidente> findAll() {
        return repository.findAll();
    }

    @Override
    public Incidente save(Incidente entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
