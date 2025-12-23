package com.sebastianidm.inventory.repositories;

import com.sebastianidm.inventory.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Capa de Acceso a Datos (Repository).
 * Extiende de JpaRepository para obtener métodos CRUD mágicos sin escribir SQL.
 * <Product, Long> -> <Entidad, Tipo de dato del ID>
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // No es necesario escribir código aquí.
    // Spring Data JPA implementa métodos como save(), findAll(), findById(), deleteById() en tiempo de ejecución.
}