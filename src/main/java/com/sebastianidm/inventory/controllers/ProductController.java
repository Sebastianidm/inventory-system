package com.sebastianidm.inventory.controllers;

import com.sebastianidm.inventory.models.Product;
import com.sebastianidm.inventory.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Capa de Controladores (API REST).
 * Se encarga de recibir peticiones HTTP, delegar al servicio y responder con JSON y Códigos de Estado.
 */
@RestController // Indica que responde con datos (JSON), no vistas HTML.
@RequestMapping("/api/products") // Ruta base para todos los endpoints de esta clase.
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> listProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = productService.getProductById(id);
        // Responde 200 OK si está presente, o 404 Not Found si está vacío.
        return product.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        // @RequestBody convierte el JSON entrante a un objeto Java 'Product'.
        return productService.saveProduct(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        Optional<Product> updatedProduct = productService.updateProduct(id, productDetails);

        return updatedProduct.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        if (productService.deleteProduct(id)) {
            return ResponseEntity.noContent().build(); // 204 No Content (Éxito sin cuerpo).
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found.
        }
    }
}