
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.DominioISO;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.DominioISORepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IDominioISOService;

@Service
public class DominioISOService implements IDominioISOService {
    
    @Autowired
    private DominioISORepository repository;

    @Override
    public List<DominioISO> findAll() {
        return repository.findAll();
    }

    @Override
    public DominioISO save(DominioISO entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
