
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Activo;

public interface IActivoService {
    List<Activo> findAll();
    Activo save(Activo entity);
    void deleteById(Integer id);
}
