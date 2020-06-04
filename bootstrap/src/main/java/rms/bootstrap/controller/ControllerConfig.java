package rms.bootstrap.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rms.infrastructure.controller.*;

@Configuration
public class ControllerConfig {


    @Bean
    public SayHi userController(){
        return new SayHi();
    }
}
