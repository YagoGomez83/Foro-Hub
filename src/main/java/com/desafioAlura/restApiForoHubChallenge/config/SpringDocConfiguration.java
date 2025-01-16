package com.desafioAlura.restApiForoHubChallenge.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT"))
                )
                .info(new Info()
                        .title("REST API ForumHub")
                        .description("This project implements a REST API for a forum system where users can create, list, edit, and delete topics. "
                                + "The API leverages modern technologies and tools, ensuring scalability, security, and ease of integration. "
                                + "Built with Java and Spring Boot, the project follows best practices for RESTful APIs and incorporates the following features:\n\n"
                                + "- **Lombok**: To simplify code by reducing boilerplate (e.g., getters, setters, constructors).\n"
                                + "- **Spring Web**: For building RESTful web services and managing HTTP requests.\n"
                                + "- **Spring Boot DevTools**: To enhance developer productivity with auto-restart capabilities during development.\n"
                                + "- **Spring Data JPA**: For seamless database integration and object-relational mapping.\n"
                                + "- **Flyway Migration**: To manage database migrations and ensure schema consistency.\n"
                                + "- **MySQL Driver**: For connecting and interacting with a MySQL database.\n"
                                + "- **Validation**: To enforce business rules and validate user inputs.\n"
                                + "- **Spring Security**: To implement robust authentication and authorization, using JWT (JSON Web Tokens).\n\n"
                                + "This project provides a robust foundation for building scalable and secure APIs for forum systems.")
                        .contact(new Contact()
                                .name("Gomez Yago")
                                .email("kyow@hotmail.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://forumhub.alura/api/licence")));
    }
}
