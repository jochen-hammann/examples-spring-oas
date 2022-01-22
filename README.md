# OpenAPI Specification (OAS) 

This example shows the integration of [OpenAPI Specification (OAS)](https://www.openapis.org/) in Spring Boot projects.

### Endpoint

The following URL retrieves the OAS as JSON:

    http://localhost:8080/<context-path>/v3/api-docs/

To get the OAS in YAML use the following URL:

    http://localhost:8080/<context-path>/v3/api-docs.yaml

### Configuration

The OAS support can be configured within the Spring Environment (z.B. <code>application.properties</code>).

```
# Change the /v3/api-docs endpoint.
springdoc.api-docs.path=/api-docs

# Disable the /v3/api-docs endpoint.
# springdoc.api-docs.enabled=false

# Disable the swagger-ui.
# springdoc.swagger-ui.enabled=false
```

### Swagger UI

The following URL opens an integrated Swagger UI to show the OAS within a web UI.

    http://localhost:8080/<context-path>/swagger-ui.html

### See also

* [springdoc-openapi](https://springdoc.org/)
* [Swagger 2.X Annotations (OpenAPI 3.0)](https://github.com/swagger-api/swagger-core/wiki/Swagger-2.X---Annotations)
* [Swagger 2.X Annotations (OpenAPI 3.0) - JavaDoc](https://javadoc.io/doc/io.swagger.core.v3/swagger-annotations/latest/index.html)
* [Baeldung: Documenting a Spring REST API Using OpenAPI 3.0](https://www.baeldung.com/spring-rest-openapi-documentation)
* [Tutorial: Documenting Spring Boot REST API with SpringDoc + OpenAPI 3](https://www.dariawan.com/tutorials/spring/documenting-spring-boot-rest-api-springdoc-openapi-3/)
