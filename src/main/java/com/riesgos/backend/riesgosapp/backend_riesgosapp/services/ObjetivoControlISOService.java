
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ObjetivoControlISO;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.ObjetivoControlISORepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IObjetivoControlISOService;

@Service
public class ObjetivoControlISOService implements IObjetivoControlISOService {
    
    @Autowired
    private ObjetivoControlISORepository repository;

    @Override
    public List<ObjetivoControlISO> findAll() {
        return repository.findAll();
    }

    @Override
    public ObjetivoControlISO save(ObjetivoControlISO entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
