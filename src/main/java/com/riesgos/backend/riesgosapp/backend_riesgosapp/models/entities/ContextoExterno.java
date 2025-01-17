
package com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contextoexterno")
@Data
@NoArgsConstructor
public class ContextoExterno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, columnDefinition = "NVARCHAR(MAX)")
    private String descripcion;
}
