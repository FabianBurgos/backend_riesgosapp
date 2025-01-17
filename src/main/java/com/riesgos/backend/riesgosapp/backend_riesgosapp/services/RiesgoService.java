
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Riesgo;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.RiesgoRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IRiesgoService;

@Service
public class RiesgoService implements IRiesgoService {
    
    @Autowired
    private RiesgoRepository repository;

    @Override
    public List<Riesgo> findAll() {
        return repository.findAll();
    }

    @Override
    public Riesgo save(Riesgo entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
