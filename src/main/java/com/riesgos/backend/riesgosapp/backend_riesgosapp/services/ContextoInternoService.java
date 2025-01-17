
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ContextoInterno;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.ContextoInternoRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IContextoInternoService;

@Service
public class ContextoInternoService implements IContextoInternoService {
    
    @Autowired
    private ContextoInternoRepository repository;

    @Override
    public List<ContextoInterno> findAll() {
        return repository.findAll();
    }

    @Override
    public ContextoInterno save(ContextoInterno entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
