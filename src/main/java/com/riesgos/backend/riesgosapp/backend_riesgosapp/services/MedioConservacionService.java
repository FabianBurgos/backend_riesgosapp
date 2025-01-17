
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.MedioConservacion;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.MedioConservacionRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IMedioConservacionService;

@Service
public class MedioConservacionService implements IMedioConservacionService {
    
    @Autowired
    private MedioConservacionRepository repository;

    @Override
    public List<MedioConservacion> findAll() {
        return repository.findAll();
    }

    @Override
    public MedioConservacion save(MedioConservacion entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
