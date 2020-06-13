package com.language.grammar.configuration.jpa;


import com.language.grammar.infrastructure.jpa.UnitJpaRepository;
import com.language.grammar.infrastructure.jpa.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaConfig {

    @Autowired(required = false)
    private UnitJpaRepository unitJpaRepository;

    @Bean
    public UnitJpaRepository unitRepository(){
        return this.unitJpaRepository;
    }
    @Bean
    public UnitService unitService(UnitJpaRepository repository){
        return new UnitService(repository);
    }


}
