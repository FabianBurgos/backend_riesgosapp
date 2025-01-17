
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.NivelRiesgo;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.NivelRiesgoRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.INivelRiesgoService;

@Service
public class NivelRiesgoService implements INivelRiesgoService {
    
    @Autowired
    private NivelRiesgoRepository repository;

    @Override
    public List<NivelRiesgo> findAll() {
        return repository.findAll();
    }

    @Override
    public NivelRiesgo save(NivelRiesgo entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
