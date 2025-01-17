
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Proceso;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.ProcesoRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IProcesoService;

@Service
public class ProcesoService implements IProcesoService {
    
    @Autowired
    private ProcesoRepository repository;

    @Override
    public List<Proceso> findAll() {
        return repository.findAll();
    }

    @Override
    public Proceso save(Proceso entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
