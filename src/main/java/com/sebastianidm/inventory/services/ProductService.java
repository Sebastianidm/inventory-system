package com.sebastianidm.inventory.services;

import com.sebastianidm.inventory.models.Product;
import com.sebastianidm.inventory.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Capa de Lógica de Negocio (Service).
 * Aquí ocurren las validaciones, cálculos y llamadas al repositorio.
 * Actúa como intermediario entre el Controller y el Repository.
 */
@Service
public class ProductService {

    private final ProductRepository productRepository;

    // Inyección de Dependencias por Constructor (Mejor práctica que @Autowired).
    // Facilita el testing y asegura que el servicio no exista sin su repositorio.
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Retorna un Optional para evitar NullPointerExceptions si el ID no existe.
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        // save() sirve para INSERT (si no tiene ID) y UPDATE (si tiene ID).
        return productRepository.save(product);
    }

    public Optional<Product> updateProduct(Long id, Product productDetails) {
        // 1. Buscamos si existe. 2. Si existe, actualizamos y guardamos.
        return productRepository.findById(id).map(existingProduct -> {
            existingProduct.setName(productDetails.getName());
            existingProduct.setPrice(productDetails.getPrice());
            return productRepository.save(existingProduct);
        });
    }

    public boolean deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}