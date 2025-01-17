
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ContextoExterno;

public interface IContextoExternoService {
    List<ContextoExterno> findAll();
    ContextoExterno save(ContextoExterno entity);
    void deleteById(Integer id);
}
