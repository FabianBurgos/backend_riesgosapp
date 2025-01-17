
package com.riesgos.backend.riesgosapp.backend_riesgosapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer> {
}
