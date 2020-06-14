package com.language.grammar;

import com.language.grammar.configuration.SwaggerConfig;
import com.language.grammar.configuration.controller.ControllerConfig;
import com.language.grammar.configuration.jpa.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = {"com.language.grammar.infrastructure"})
@EntityScan(basePackages = {"com.language.grammar.domain"})
@ComponentScan(basePackages = {"com.language.grammar.infrastructure"})
@Import({SwaggerConfig.class,
		ControllerConfig.class})
//@EnableFeignClients(basePackages = {"rms.infrastructure"})
public class Grammer {

	public static void main(String[] args) {
		SpringApplication.run(Grammer.class, args);
	}

}
