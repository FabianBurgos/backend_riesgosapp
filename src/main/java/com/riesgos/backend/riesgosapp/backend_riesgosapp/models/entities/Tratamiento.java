
package com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tratamiento")
@Data
@NoArgsConstructor
public class Tratamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "riesgo_id", nullable = false)
    private Riesgo riesgo;

    @Column(nullable = false, length = 50)
    private String estrategiaTratamiento;  // Ej. "Aceptar", "Reducir", "Evitar", "Compartir"

    @Column(columnDefinition = "NVARCHAR(MAX)")
    private String planAccion;  // Descripción detallada del plan de acción

    @Column(nullable = false)
    private LocalDate fechaImplementacion;  // Fecha de implementación del tratamiento

    @Column(nullable = false)
    private LocalDate fechaSeguimiento;  // Fecha de seguimiento del tratamiento

    @Column(nullable = false, length = 255)
    private String estadoTratamiento;  // Ej. "En Proceso", "Completado", "Evaluado"
}
