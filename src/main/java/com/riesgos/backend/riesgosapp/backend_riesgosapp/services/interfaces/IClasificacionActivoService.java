
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ClasificacionActivo;

public interface IClasificacionActivoService {
    List<ClasificacionActivo> findAll();
    ClasificacionActivo save(ClasificacionActivo entity);
    void deleteById(Integer id);
}
