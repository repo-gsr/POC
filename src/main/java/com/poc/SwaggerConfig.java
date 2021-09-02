package com.poc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.poc.rest")).paths(PathSelectors.any())
				.build().apiInfo(apiInformation());
	}

	private ApiInfo apiInformation() {

		return new ApiInfoBuilder().title("reward").description("Calculate Rewards")
				.contact(
						new springfox.documentation.service.Contact("Subbareddy", "URL", "SubbareddyGangala@gmail.com"))
				.build();

	}
}