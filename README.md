# 🛒 Create Product Service

> Un potente microservicio REST desarrollado con Spring Boot para gestionar productos de manera eficiente.

## 🚀 Descripción
Create Product Service es un microservicio moderno y escalable diseñado para manejar la información de productos mediante un conjunto de endpoints RESTful. Utiliza Spring Boot y JPA para ofrecer una solución robusta y flexible para la gestión de productos.

## 💻 Tecnologías Utilizadas
- Spring Boot
- Java
- JPA (Java Persistence API)

## 🌟 Características Principales
- Creación de productos con información detallada.
- Persistencia de datos con JPA.
- API REST estructurada para una fácil integración.
- Arquitectura modular con separación de responsabilidades.

## 📌 API Endpoints

- **POST** `/products/create` - Crear un nuevo producto.

## 🛠 Modelo de Datos

Un producto contiene la siguiente información:
- `id_product`: Identificador único del producto.
- `name`: Nombre del producto.
- `description`: Descripción del producto.
- `price`: Precio del producto.
- `id_category`: Identificador de la categoría a la que pertenece.
- `availability`: Indica si el producto está disponible o no.

## 📂 Estructura del Proyecto
```
com.mipagina.create_product_service/
├── 📄 CreateProductServiceApplication.java
├── 📁 controller/
│   └── ProductController.java
├── 📁 model/
│   └── Product.java
├── 📁 repository/
│   └── IProductRepository.java
└── 📁 service/
    └── IProductService.java
```

## 🚀 Instalación y Uso
1. Clona el repositorio y navega al directorio del proyecto.
2. Asegúrate de tener Java y Maven instalados.
3. Ejecuta el servicio con:
   ```sh
   mvn spring-boot:run
   ```
4. Accede a los endpoints desde Postman o cualquier cliente API.

## 📌 Contribución
Si deseas contribuir, abre un issue o un pull request con tus mejoras. ¡Toda ayuda es bienvenida!

---
**Create Product Service** - Microservicio desarrollado con ❤️ y Spring Boot 🚀

