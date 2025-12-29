# Inventory Management System API 

API RESTful profesional para gestión de inventario. Este proyecto implementa una arquitectura robusta utilizando **Spring Boot**, persistencia de datos real y documentación automática.

## Características Principales

* **CRUD Completo:** Gestión de productos (Crear, Leer, Actualizar, Eliminar).
* **Base de Datos Real:** Persistencia utilizando **PostgreSQL**.
* **Validaciones Robustas:** Protección de datos con Jakarta Validation (`@NotNull`, `@Min`, etc.).
* **Manejo de Errores Global:** Arquitectura centralizada de excepciones con `@ControllerAdvice`.
* **Documentación Viva:** Interfaz interactiva con **Swagger UI / OpenAPI**.
* **Seguridad:** Gestión de credenciales mediante Variables de Entorno.

## Tecnologías

* Java 24
* Spring Boot 3+ (v4.0.1 Experimental)
* Spring Data JPA (Hibernate)
* PostgreSQL 16
* Lombok
* OpenAPI (Swagger)

## Documentación de la API (Swagger)

Una vez iniciada la aplicación, puedes probar todos los endpoints e interactuar con el sistema aquí:
**[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)**

## Configuración e Instalación

### Requisitos Previos
* Tener **PostgreSQL** instalado y ejecutándose.
* Crear una base de datos llamada `inventory`.

### Variables de Entorno (Importante)
Por seguridad, este proyecto no contiene contraseñas en el código. Debes configurar la siguiente variable de entorno en tu IDE o sistema operativo antes de ejecutar:

| Variable | Descripción | Ejemplo |
| :--- | :--- | :--- |
| `DB_PASSWORD` | Tu contraseña local de PostgreSQL | `mi_password_secreto` |

### Ejecución
```bash
./mvnw spring-boot:run