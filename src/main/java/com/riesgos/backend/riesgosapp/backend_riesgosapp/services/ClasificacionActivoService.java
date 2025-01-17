
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ClasificacionActivo;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.ClasificacionActivoRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IClasificacionActivoService;

@Service
public class ClasificacionActivoService implements IClasificacionActivoService {
    
    @Autowired
    private ClasificacionActivoRepository repository;

    @Override
    public List<ClasificacionActivo> findAll() {
        return repository.findAll();
    }

    @Override
    public ClasificacionActivo save(ClasificacionActivo entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
