
package com.riesgos.backend.riesgosapp.backend_riesgosapp.services.interfaces;

import java.util.List;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ObjetivoControlISO;

public interface IObjetivoControlISOService {
    List<ObjetivoControlISO> findAll();
    ObjetivoControlISO save(ObjetivoControlISO entity);
    void deleteById(Integer id);
}
