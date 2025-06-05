# 🎬 Sistema de Gestión de Películas y Reseñas - JPATP

Este proyecto fue desarrollado como parte de un trabajo práctico para la materia **Base de Datos 2**, y tiene como objetivo aplicar conocimientos sobre diseño de bases de datos, desarrollo backend y consumo de APIs.  

El sistema permite gestionar una base de datos de películas, actores, géneros y reseñas, brindando una estructura sólida que simula una aplicación real para el manejo de información relacionada al cine.

---

## 📚 ¿Qué hace este sistema?

Con este proyecto podés:

✅ Registrar nuevas películas, asignándoles directores, actores y géneros  
✅ Consultar información de las películas guardadas  
✅ Agregar reseñas con opiniones y puntuaciones  
✅ Relacionar múltiples actores con una misma película  
✅ Visualizar todo el contenido desde herramientas como Postman  

El sistema está pensado para que funcione como una API RESTful, donde otros sistemas o usuarios pueden conectarse para obtener o enviar información de forma ordenada.

---

## 🔧 ¿Cómo está hecho?

La aplicación fue desarrollada usando las siguientes herramientas y tecnologías:

- **Java** como lenguaje de programación principal  
- **Spring Boot**, un framework moderno para construir aplicaciones web en Java  
- **MySQL** como sistema gestor de base de datos  
- **Maven** para la gestión de dependencias  
- **Postman** para realizar pruebas y validar que los endpoints funcionan correctamente  
- **JPA (Hibernate)** para manejar la persistencia de datos  
- **SQL** para la creación de tablas y relaciones en la base de datos

---

## 🧱 ¿Qué contiene el proyecto?

El repositorio está organizado de esta forma:

- 📁 `Script de BD/`: scripts SQL con las instrucciones para crear la base de datos llamada `cine_db_ramiro`  
- 📁 `Capturas MYSQL/`: imágenes con la estructura visual de las tablas creadas  
- 📁 `CapturasPOSTMAN/`: pruebas realizadas con Postman para verificar el funcionamiento de los endpoints  
- 📄 `pom.xml`: archivo que contiene las dependencias necesarias para ejecutar el proyecto con Maven  
- 📄 Código fuente en Java organizado por capas siguiendo el patrón **MVC (Modelo - Vista - Controlador)**

---

## 🧪 ¿Cómo lo probamos?

Para poder ejecutar y probar este sistema, es necesario:

1. Tener MySQL instalado y crear la base de datos usando los scripts provistos 
   spring.application.name=movies
   spring.datasource.url=jdbc:mysql://localhost:3306/cine_db_ramiro
   spring.datasource.username=root
   spring.datasource.password=asd123
   spring.jpa.hibernate.ddl-auto=update 
2. Configurar el archivo de propiedades para indicar el nombre de usuario y contraseña de tu base de datos  
3. Ejecutar la aplicación desde tu IDE (como IntelliJ o Eclipse)
