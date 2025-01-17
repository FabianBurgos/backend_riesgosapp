
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ContextoProceso;

public interface IContextoProcesoService {
    List<ContextoProceso> findAll();
    ContextoProceso save(ContextoProceso entity);
    void deleteById(Integer id);
}
