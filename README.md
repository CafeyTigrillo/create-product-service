# 🛒 Create Product Service

> A powerful REST microservice built with Spring Boot to efficiently manage products.

## 🚀 Description
Create Product Service is a modern and scalable microservice designed to handle product information through a set of RESTful endpoints. It uses Spring Boot and JPA to provide a robust and flexible solution for product management.

## 💻 Tech Stack
- Spring Boot
- Java
- JPA (Java Persistence API)

## 🌟 Key Features
- Product creation with detailed information.
- Data persistence using JPA.
- Structured REST API for easy integration.
- Modular architecture with clear separation of concerns.

## 📌 API Endpoints

- **POST** `/products/create` - Create a new product.

## 🛠 Data Model

A product contains the following information:
- `id_product`: Unique identifier for the product.
- `name`: Product name.
- `description`: Product description.
- `price`: Product price.
- `id_category`: Identifier of the category it belongs to.
- `availability`: Indicates whether the product is available or not.

## 📂 Project Structure
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

## 🚀 Installation and Usage
1. Clone the repository and navigate to the project directory.
2. Ensure you have Java and Maven installed.
3. Run the service with:
   ```sh
   mvn spring-boot:run
   ```
4. Access the endpoints using Postman or any API client.

## 📌 Contribution
If you wish to contribute, open an issue or a pull request with your improvements. Any help is welcome!

---
**Create Product Service** - Microservice developed with ❤️ and Spring Boot 🚀

