package com.example.spring.documentation.openapi;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @formatter:off
@OpenAPIDefinition(
		info = @Info(
				title = "REST API Specification",
				version = "1.0",
				description = "This is the REST API specification using OpenAPI.",
				license = @License(name = "Apache 2.0", url = "http://foo.bar"),
				contact = @Contact(url = "http://example.com", name = "Jochen", email = "info@example.com")
		),
		tags = {
				@Tag(name = "Tag 1", description = "desc 1", externalDocs = @ExternalDocumentation(description = "docs desc")),
				@Tag(name = "Tag 2", description = "desc 2", externalDocs = @ExternalDocumentation(description = "docs desc 2")),
				@Tag(name = "Tag 3")
		},
		externalDocs = @ExternalDocumentation(description = "definition docs desc"),
		security = {
				@SecurityRequirement(name = "req 1", scopes = {"a", "b"}),
				@SecurityRequirement(name = "req 2", scopes = {"b", "c"})
		},
		servers = {
				@Server(
						description = "server 1",
						url = "http://foo",
						variables = {
								@ServerVariable(name = "var1", description = "var 1", defaultValue = "1", allowableValues = {"1", "2"}),
								@ServerVariable(name = "var2", description = "var 2", defaultValue = "1", allowableValues = {"1", "2"})
						})
		}
)
// @formatter:on
@SpringBootApplication
public class OpenapiApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(OpenapiApplication.class, args);
    }

}
