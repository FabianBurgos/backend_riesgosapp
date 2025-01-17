
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Incidente;

public interface IIncidenteService {
    List<Incidente> findAll();
    Incidente save(Incidente entity);
    void deleteById(Integer id);
}
