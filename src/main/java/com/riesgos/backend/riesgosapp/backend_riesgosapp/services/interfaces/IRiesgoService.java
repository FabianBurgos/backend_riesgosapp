
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Riesgo;

public interface IRiesgoService {
    List<Riesgo> findAll();
    Riesgo save(Riesgo entity);
    void deleteById(Integer id);
}
