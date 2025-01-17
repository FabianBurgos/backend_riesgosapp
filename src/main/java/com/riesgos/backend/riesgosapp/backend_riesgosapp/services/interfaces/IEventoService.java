
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Evento;

public interface IEventoService {
    List<Evento> findAll();
    Evento save(Evento entity);
    void deleteById(Integer id);
}
