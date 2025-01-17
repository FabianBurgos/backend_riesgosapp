
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Formato;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.FormatoRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IFormatoService;

@Service
public class FormatoService implements IFormatoService {
    
    @Autowired
    private FormatoRepository repository;

    @Override
    public List<Formato> findAll() {
        return repository.findAll();
    }

    @Override
    public Formato save(Formato entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
