# 🧮 Aplicativo de Operaciones Matemáticas con Microservicios

Este proyecto es una aplicación web desarrollada en **Java Spring Boot** que permite realizar **operaciones matemáticas básicas** (suma, resta, multiplicación y división) a través de **microservicios independientes**, utilizando **Thymeleaf** como motor de plantillas para la interfaz de usuario.

---

## 🚀 Características principales

* Arquitectura basada en **microservicios**.
* Interfaz web dinámica con **Thymeleaf**.
* Comunicación entre servicios usando **REST API**.
* Uso de **Spring Boot** para configuración y ejecución.
* Diseño modular y escalable.

---

## 🧩 Microservicios incluidos

1. **Servicio de Suma**
2. **Servicio de Resta**
3. **Servicio de Multiplicación**
4. **Servicio de División**
5. **Servicio Gateway / API central**

   * Coordina las peticiones entre el frontend y los microservicios.

---

## 💻 Tecnologías utilizadas

* **Java 20+**
* **Spring Boot 3+**
* **Spring Web**
* **Thymeleaf**
* **Maven**
* **Postman** (para pruebas de endpoints)

---

## ⚙️ Estructura del proyecto

```

```

Cada servicio se ejecuta de forma independiente, escuchando en un puerto diferente.
El **gateway-service** actúa como punto de entrada principal para las solicitudes del cliente.

---

## 🌐 Interfaz web (Thymeleaf)

La aplicación web incluye un formulario donde el usuario puede:

* Ingresar dos números.
* Seleccionar la operación deseada.
* Visualizar el resultado calculado por el microservicio correspondiente.

---

## ▶️ Ejecución del proyecto

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/usuario/operaciones.git
   cd operaciones
   ```

2. Compilar y ejecutar cada microservicio:

   ```bash
   mvn clean spring-boot:run
   ```

3. Acceder a la aplicación web:

   ```
   http://localhost:8080
   ```

---

## 🧪 Ejemplo de uso

**Petición (REST):**

```http

```

**Respuesta:**

```json

```

---

## 📄 Licencia

Este proyecto se distribuye bajo la licencia **MIT**, lo que permite su uso, modificación y distribución libremente, siempre que se mantenga la atribución original.

---

## 👨‍💻 Autor

**Emiliano Ulises Figueroa García**
Proyecto educativo / demostrativo con fines de aprendizaje de **Spring Boot**, **Thymeleaf** y **arquitectura de microservicios**.
