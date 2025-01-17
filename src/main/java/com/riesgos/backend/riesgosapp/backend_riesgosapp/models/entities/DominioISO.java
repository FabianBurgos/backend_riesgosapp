
package com.riesgos.backend.riesgosapp.backend_riesgosapp.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dominioiso")
@Data
@NoArgsConstructor
public class DominioISO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String descripcion;
}
