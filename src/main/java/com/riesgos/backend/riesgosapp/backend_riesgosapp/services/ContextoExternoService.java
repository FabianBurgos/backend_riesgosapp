
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ContextoExterno;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.ContextoExternoRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IContextoExternoService;

@Service
public class ContextoExternoService implements IContextoExternoService {
    
    @Autowired
    private ContextoExternoRepository repository;

    @Override
    public List<ContextoExterno> findAll() {
        return repository.findAll();
    }

    @Override
    public ContextoExterno save(ContextoExterno entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
