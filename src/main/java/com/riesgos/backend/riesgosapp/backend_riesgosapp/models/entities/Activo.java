
package com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "activo")
@Data
@NoArgsConstructor
public class Activo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false, columnDefinition = "NVARCHAR(MAX)")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "clasificacion_id", nullable = false)
    private ClasificacionActivo clasificacionActivo;

    @ManyToOne
    @JoinColumn(name = "idioma_id", nullable = false)
    private Idioma idioma;

    @ManyToOne
    @JoinColumn(name = "formato_id", nullable = false)
    private Formato formato;

    @ManyToOne
    @JoinColumn(name = "medio_conservacion_id", nullable = false)
    private MedioConservacion medioConservacion;

    @ManyToOne
    @JoinColumn(name = "proceso_id", nullable = false)
    private Proceso proceso;
}
