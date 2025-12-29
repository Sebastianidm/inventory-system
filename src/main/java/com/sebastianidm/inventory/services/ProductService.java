package com.sebastianidm.inventory.services;

import com.sebastianidm.inventory.exceptions.ResourceNotFoundException;
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

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No se encontró el producto con ID: " + id));
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }



    public Product updateProduct(Long id, Product productDetails) {
        Product existingProduct = getProductById(id);
        existingProduct.setName(productDetails.getName());
        existingProduct.setPrice(productDetails.getPrice());
        return productRepository.save(existingProduct);
    }


    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new ResourceNotFoundException("No se puede eliminar. El producto con ID " + id + " no existe.");
        }
        productRepository.deleteById(id);
    }
}