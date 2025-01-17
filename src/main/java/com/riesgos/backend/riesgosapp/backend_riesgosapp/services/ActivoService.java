
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Activo;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.ActivoRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IActivoService;

@Service
public class ActivoService implements IActivoService {
    
    @Autowired
    private ActivoRepository repository;

    @Override
    public List<Activo> findAll() {
        return repository.findAll();
    }

    @Override
    public Activo save(Activo entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
