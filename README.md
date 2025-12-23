# Inventory Management System API 📦

Una API RESTful robusta diseñada para la gestión de inventario empresarial. Este proyecto demuestra la implementación de una arquitectura escalable utilizando el ecosistema **Spring Boot**, siguiendo principios de diseño limpio y buenas prácticas de desarrollo backend.

## 🚀 Tecnologías y Herramientas

* **Lenguaje:** Java 24 (Target 17/21 LTS)
* **Framework:** Spring Boot 3
* **ORM:** Spring Data JPA (Hibernate)
* **Base de Datos:** H2 Database (In-Memory para desarrollo)
* **Herramientas:** Maven, Lombok, IntelliJ IDEA

## 🏗️ Arquitectura del Proyecto

El sistema sigue una arquitectura en capas clásica para asegurar la separación de responsabilidades:

1.  **Controller Layer:** Puntos de entrada de la API. Maneja las peticiones HTTP y los códigos de respuesta.
2.  **Service Layer:** Contiene la lógica de negocio pura. Decopla el controlador del acceso a datos.
3.  **Repository Layer:** Interfaz con la base de datos utilizando `JpaRepository`.
4.  **Model Layer:** Entidades JPA que representan la estructura de la base de datos.

## 🔌 API Endpoints

| Método | Endpoint             | Descripción                                      |
| :---   | :---                 | :---                                             |
| `GET`    | `/api/products`      | Obtener listado completo de productos            |
| `GET`    | `/api/products/{id}` | Buscar un producto específico por ID             |
| `POST`   | `/api/products`      | Crear un nuevo producto (JSON Body)              |
| `PUT`    | `/api/products/{id}` | Actualizar información de un producto existente  |
| `DELETE` | `/api/products/{id}` | Eliminar un producto del sistema                 |

## 🛠️ Instalación y Ejecución

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/sebastianidm/inventory-system.git](https://github.com/sebastianidm/inventory-system.git)
    ```
2.  **Ejecutar la aplicación:**
    ```bash
    ./mvnw spring-boot:run
    ```
3.  **Acceder a la API:**
    El servidor iniciará en `http://localhost:8080`.

---
**Desarrollado por [SebastianIDM](https://github.com/sebastianidm)**