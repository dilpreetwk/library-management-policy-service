package org.example.policy.service.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Policy Service API",
                version = "1.0",
                description = "API for managing library policies"
        )
)
@Configuration
public class OpenApiConfig {
}
