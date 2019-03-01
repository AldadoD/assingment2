package com.aldado;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnyName {

    @Bean(name = "typical")
    public Calculatorinterface getService(){
        return new Calculatorinterfaceimpl();
    }
}
