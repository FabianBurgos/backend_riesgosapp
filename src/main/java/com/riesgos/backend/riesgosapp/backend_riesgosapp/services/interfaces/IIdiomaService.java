
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Idioma;

public interface IIdiomaService {
    List<Idioma> findAll();
    Idioma save(Idioma entity);
    void deleteById(Integer id);
}
