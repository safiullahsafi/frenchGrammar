package rms.bootstrap.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import port.UnitRepository;
import rms.infrastructure.controller.*;
import usecases.UnitUsecase;

@Configuration
public class ControllerConfig {


    @Bean
    public UnitController unitController(UnitRepository repository){
        return new UnitController(new UnitUsecase(repository));
    }
}
