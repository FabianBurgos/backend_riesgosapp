
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Proceso;

public interface IProcesoService {
    List<Proceso> findAll();
    Proceso save(Proceso entity);
    void deleteById(Integer id);
}
