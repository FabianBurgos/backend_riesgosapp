
package com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "riesgo")
@Data
@NoArgsConstructor
public class Riesgo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, columnDefinition = "NVARCHAR(MAX)")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "activo_id", nullable = false)
    private Activo activo;

    @ManyToOne
    @JoinColumn(name = "nivel_riesgo_id", nullable = false)
    private NivelRiesgo nivelRiesgo;

    @Column(nullable = false, length = 255)
    private String frecuenciaInherente;

    @Column(nullable = false, length = 255)
    private String probabilidadInherente;

    @Column(nullable = false, length = 255)
    private String impactoInherente;

    @Column(nullable = false, length = 255)
    private String zonaRiesgoInherente;

    @Column(nullable = false, length = 255)
    private String zonaRiesgoResidual;

    @Column(columnDefinition = "NVARCHAR(MAX)")
    private String opcionesManejo;

    @Column(columnDefinition = "NVARCHAR(MAX)")
    private String apetitoRiesgo;  // Apetito de riesgo en términos descriptivos

    @Column(nullable = false, length = 255)
    private String estadoRiesgo;  // Ej. "Dentro del apetito", "Fuera del apetito"

    @Column(nullable = false, length = 255)
    private String estadoTratamiento;  // Ej. "En Proceso", "Completado", "Evaluado"

    @Column(nullable = false)
    private LocalDate fechaSeguimiento;  // Fecha del seguimiento del tratamiento

    @Column(nullable = false, length = 255)
    private String riesgoResidual;  // Ej. "Bajo", "Moderado", "Alto"
    
    @OneToMany(mappedBy = "riesgo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tratamiento> tratamientos = new ArrayList<>();  // Relación de múltiples tratamientos
}
