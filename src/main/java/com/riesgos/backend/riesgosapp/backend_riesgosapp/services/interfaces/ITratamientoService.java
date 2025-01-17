
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Tratamiento;

public interface ITratamientoService {
    List<Tratamiento> findAll();
    Tratamiento save(Tratamiento entity);
    void deleteById(Integer id);
}
