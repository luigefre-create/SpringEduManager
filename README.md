# SpringEduManager - Sistema de Gestión Educativa

Proyecto desarrollado con Java y Spring Boot para la gestión de estudiantes y cursos académicos.

## 🚀 Tecnologías Utilizadas
* **Java 21**
* **Spring Boot 3** (Spring Data JPA, Spring Security, Spring Web)
* **Base de Datos:** H2 Database en memoria
* **Vista:** Thymeleaf + Bootstrap 5
* **Gestor de Dependencias:** Maven

## 🔑 Usuarios y Roles de Acceso
* **Usuario Estándar:** `user` | Contraseña: `1234` *(Acceso a listas y registro de estudiantes)*
* **Administrador:** `admin` | Contraseña: `admin123` *(Permiso para crear cursos)*

## 🌐 Rutas y Endpoints
* **Vista Estudiantes:** `http://localhost:8080/estudiantes`
* **Vista Cursos:** `http://localhost:8080/cursos`
* **Consola H2:** `http://localhost:8080/h2-console` *(JDBC URL: `jdbc:h2:mem:edudb`)*
* **API REST Estudiantes:** `http://localhost:8080/api/estudiantes`
* **API REST Cursos:** `http://localhost:8080/api/cursos`

## ⚙️ Instrucciones de Ejecución (.jar)
1. Abrir la consola en la carpeta raíz del proyecto.
2. Ejecutar el archivo autocontenido:
   ```bash
   java -jar target/SpringEduManager-0.0.1-SNAPSHOT.jar
