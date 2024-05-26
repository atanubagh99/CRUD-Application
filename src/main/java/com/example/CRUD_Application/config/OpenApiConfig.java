package com.example.CRUD_Application.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "CRUD Book Application",
                description = "It's a simple CRUD application",
                summary = "It has create, read, update & delete operation",
                termsOfService = "T&C",
                contact = @Contact(
                        name = "Atanu Kumar Bagh",
                        email = "atanubagh99@gmail.com"
                ),
                license = @License(
                        name = "https://github.com/atanubagh99/"
                ),
                version = "v1"
        ),
        servers = {
                @Server(
                        description = "Development",
                        url = "http://localhost:9090"
                ),
                @Server(
                        description = "Production",
                        url = "http://localhost:9090"
                )
        },
        security = @SecurityRequirement(
                name = "auth"
        )
)
@SecurityScheme(
        name = "auth",
        in = SecuritySchemeIn.HEADER,
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer",
        description = "security description"
)
public class OpenApiConfig {
}