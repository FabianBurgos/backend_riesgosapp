
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.NivelRiesgo;

public interface INivelRiesgoService {
    List<NivelRiesgo> findAll();
    NivelRiesgo save(NivelRiesgo entity);
    void deleteById(Integer id);
}
