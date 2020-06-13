package com.language.grammar.configuration.controller;


import com.language.grammar.domain.usecases.UnitUsecase;
import com.language.grammar.infrastructure.controller.UnitController;
import com.language.grammar.infrastructure.jpa.UnitService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {


    @Bean
    public UnitController unitController(UnitService repository){
        return new UnitController(new UnitUsecase(repository));
    }
}
