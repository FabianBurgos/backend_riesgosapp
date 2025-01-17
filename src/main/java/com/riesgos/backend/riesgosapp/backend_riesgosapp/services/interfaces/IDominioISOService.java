
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.DominioISO;

public interface IDominioISOService {
    List<DominioISO> findAll();
    DominioISO save(DominioISO entity);
    void deleteById(Integer id);
}
