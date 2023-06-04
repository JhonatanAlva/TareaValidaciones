package com.springvalidaciones.tareavalidaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TareavalidacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareavalidacionesApplication.class, args);
	}
	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.springvalidaciones.tareavalidaciones"))
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfoBuilder()
				.title("Tarea validaciones")
				.contact(new Contact("Jhonatan", "no-url", "jloola@miumg.edu.gt"))
				.description("Escuela")
				.build();
	}
}
