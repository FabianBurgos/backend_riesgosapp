
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Evento;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories.EventoRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces.IEventoService;

@Service
public class EventoService implements IEventoService {
    
    @Autowired
    private EventoRepository repository;

    @Override
    public List<Evento> findAll() {
        return repository.findAll();
    }

    @Override
    public Evento save(Evento entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
