# Foro Hub - API REST

¡Bienvenido a Foro Hub! Este es un proyecto que replica el funcionamiento de un foro de discusión mediante una API REST utilizando tecnologías modernas. El objetivo es crear un sistema que permita la gestión de tópicos y respuestas, facilitando la interacción entre los usuarios en una plataforma similar a la que se utiliza en Alura.

## Historia

Un foro es un lugar donde los participantes de una plataforma pueden colocar sus preguntas sobre temas específicos. En Alura, los estudiantes utilizan el foro para resolver dudas sobre los cursos y proyectos en los que están participando. Este lugar está lleno de aprendizaje y colaboración entre estudiantes, profesores y moderadores.

En este desafío, replicamos este proceso a nivel de backend, creando una API REST utilizando Spring Boot. La API se centra en los tópicos y permite a los usuarios:

- Crear un nuevo tópico
- Mostrar todos los tópicos creados
- Mostrar un tópico específico
- Actualizar un tópico
- Eliminar un tópico

Este proyecto sigue las mejores prácticas del modelo REST y cuenta con una base de datos para la persistencia de la información, validaciones según reglas de negocio, y un servicio de autenticación y autorización para restringir el acceso.

## Tecnologías Utilizadas

- **Java 21**: Versión de Java utilizada para el desarrollo del proyecto.
- **Maven**: Herramienta de construcción y gestión de dependencias (versión 4).
- **Spring Boot**: Framework principal para el desarrollo de la API REST.
- **JAR**: El proyecto está empaquetado en formato JAR.
- **Lombok**: Librería para reducir el código repetitivo (getters, setters, constructores, etc.).
- **Spring Web**: Para crear servicios web RESTful.
- **Spring Boot DevTools**: Herramienta para mejorar la experiencia de desarrollo con reinicios automáticos.
- **Spring Data JPA**: Para facilitar la integración con la base de datos y gestionar las entidades JPA.
- **Flyway Migration**: Herramienta para manejar las migraciones de la base de datos.
- **MySQL Driver**: Controlador para conectar la aplicación a una base de datos MySQL.
- **Validation**: Para validar datos de entrada y garantizar que se cumplan las reglas de negocio.
- **Spring Security**: Para la implementación de seguridad y autenticación con JWT (JSON Web Token).

## Instalación y Configuración

Para ejecutar este proyecto en tu máquina local, sigue los siguientes pasos:

1. **Clona el repositorio**:
    ```bash
    git clone https://github.com/tu_usuario/foro-hub.git
    ```

2. **Configura la base de datos**:
    - Asegúrate de tener MySQL instalado y ejecutándose en tu máquina.
    - Crea una base de datos llamada `forohub`.
    - Las migraciones de la base de datos se gestionan automáticamente mediante Flyway, por lo que no necesitas hacer nada manualmente para aplicar las migraciones.

3. **Configura el archivo `application.properties`**:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/forohub
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    spring.jpa.hibernate.ddl-auto=update
    spring.flyway.enabled=true
    security.token.secret=tu_clave_secreta
    ```

4. **Ejecuta el proyecto**:
    ```bash
    mvn spring-boot:run
    ```

## Uso de Swagger

La documentación de la API está disponible en Swagger. Para acceder a ella, abre tu navegador y visita:

http://localhost:8080/swagger-ui/index.html


Aquí podrás explorar y probar todas las rutas de la API de manera interactiva. Asegúrate de autenticarte con un token JWT para acceder a las rutas protegidas.

### Rutas principales

- **POST /auth/login**: Autenticación del usuario. Devuelve un token JWT.
- **GET /topics**: Obtiene todos los tópicos.
- **GET /topics/{id}**: Obtiene un tópico específico.
- **POST /topics**: Crea un nuevo tópico.
- **PUT /topics/{id}**: Actualiza un tópico existente.
- **DELETE /topics/{id}**: Elimina un tópico.

## Endpoints de la API

La API tiene las siguientes rutas principales:

1. **Autenticación**
   - `POST /auth/login`: Inicia sesión y devuelve un token JWT para autenticar solicitudes futuras.

2. **Tópicos**
   - `GET /topics`: Obtiene todos los tópicos.
   - `GET /topics/{id}`: Obtiene un tópico por su ID.
   - `POST /topics`: Crea un nuevo tópico.
   - `PUT /topics/{id}`: Actualiza un tópico existente.
   - `DELETE /topics/{id}`: Elimina un tópico.

## Seguridad

La API está protegida con **JWT (JSON Web Token)** para la autenticación y autorización. Cuando un usuario inicia sesión correctamente, se genera un token que debe incluirse en el encabezado de las solicitudes subsecuentes en el siguiente formato:


## Contribución

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una rama para tu característica (`git checkout -b nueva-caracteristica`).
3. Realiza tus cambios y haz un commit (`git commit -am 'Agrega nueva característica'`).
4. Haz push a la rama (`git push origin nueva-caracteristica`).
5. Abre un Pull Request.

## Licencia

Este proyecto está licenciado bajo la **Licencia Apache 2.0**. Para más detalles, consulta el archivo [LICENSE](LICENSE).

---

¡Gracias por utilizar Foro Hub! ¡Esperamos que disfrutes del proyecto!

