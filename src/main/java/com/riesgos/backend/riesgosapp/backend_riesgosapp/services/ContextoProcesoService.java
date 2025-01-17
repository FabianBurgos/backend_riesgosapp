
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ContextoProceso;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.ContextoProcesoRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IContextoProcesoService;

@Service
public class ContextoProcesoService implements IContextoProcesoService {
    
    @Autowired
    private ContextoProcesoRepository repository;

    @Override
    public List<ContextoProceso> findAll() {
        return repository.findAll();
    }

    @Override
    public ContextoProceso save(ContextoProceso entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
