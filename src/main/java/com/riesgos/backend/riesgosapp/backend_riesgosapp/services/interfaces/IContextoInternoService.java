
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ContextoInterno;

public interface IContextoInternoService {
    List<ContextoInterno> findAll();
    ContextoInterno save(ContextoInterno entity);
    void deleteById(Integer id);
}
