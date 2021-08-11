package com.github.krjakbrjak.debugging_nashorn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@Configuration
@ComponentScan("com.github.krjakbrjak.debugging_nashorn")
public class Config {

    @Bean
    public ScriptEngine engine() {
        return new ScriptEngineManager().getEngineByName("nashorn");
    }

}
