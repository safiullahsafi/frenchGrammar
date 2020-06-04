package rms.bootstrap;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = {"rms.infrastructure"})
@EntityScan(basePackages = {"rms.domain.model"})
@ComponentScan(basePackages = {"rms.infrastructure","rms.bootstrap.configuration.corsFilterConfig"})
@Import({SwaggerConfig.class
      })
@EnableFeignClients(basePackages = {"rms.infrastructure"})
public class Generator {

    public static void main(String[] args) {
        SpringApplication.run(Generator.class, args);
    }

}