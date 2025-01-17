
package com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.ContextoProceso;

public interface ContextoProcesoRepository extends JpaRepository<ContextoProceso, Integer> {
}
