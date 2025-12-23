package com.sebastianidm.inventory.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad que representa la tabla 'PRODUCT' en la base de datos.
 * Utiliza JPA para el mapeo Objeto-Relacional (ORM).
 */
@Entity // Indica a JPA que esta clase es una tabla SQL.
@Data   // Lombok: Genera Getters, Setters, toString, equals, hashcode.
@AllArgsConstructor
@NoArgsConstructor // Requerido obligatoriamente por JPA para instanciar la clase vacía antes de llenarla.
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremental (La BD maneja el ID).
    private Long id;

    private String name;
    private Double price;
}