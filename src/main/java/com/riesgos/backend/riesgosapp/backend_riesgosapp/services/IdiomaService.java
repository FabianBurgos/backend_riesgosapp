
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Idioma;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.IdiomaRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IIdiomaService;

@Service
public class IdiomaService implements IIdiomaService {
    
    @Autowired
    private IdiomaRepository repository;

    @Override
    public List<Idioma> findAll() {
        return repository.findAll();
    }

    @Override
    public Idioma save(Idioma entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
