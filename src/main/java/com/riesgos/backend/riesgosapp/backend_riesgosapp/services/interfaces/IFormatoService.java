
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Formato;

public interface IFormatoService {
    List<Formato> findAll();
    Formato save(Formato entity);
    void deleteById(Integer id);
}
