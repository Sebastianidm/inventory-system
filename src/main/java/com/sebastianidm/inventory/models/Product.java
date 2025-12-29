package com.sebastianidm.inventory.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad que representa la tabla 'PRODUCT' en la base de datos.
 * Utiliza JPA para el mapeo Objeto-Relacional (ORM).
 */
@Entity
@Data   // Lombok: Genera  Getters, Setters, toString, equals, hashcode.
@AllArgsConstructor
@NoArgsConstructor // Requerido obligatoriamente por JPA para instanciar la clase vacía antes de llenarla.
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremental (La BD maneja el ID).
    private Long id;
    @NotBlank(message = "El nombre del producto no puede estar vacío")
    private String name;
    @NotNull(message = "El precio es obligatorio")
    @Min(value = 0, message="El precio no puede ser negativo")
    private Double price;
}