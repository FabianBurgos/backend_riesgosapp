
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Tratamiento;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.TratamientoRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.ITratamientoService;

@Service
public class TratamientoService implements ITratamientoService {
    
    @Autowired
    private TratamientoRepository repository;

    @Override
    public List<Tratamiento> findAll() {
        return repository.findAll();
    }

    @Override
    public Tratamiento save(Tratamiento entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
