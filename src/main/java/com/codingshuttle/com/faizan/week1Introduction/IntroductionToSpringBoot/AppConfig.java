package com.codingshuttle.com.faizan.week1Introduction.IntroductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//This is the expilicit based creation of bean Now we need to remove the component annotation in apple class
//coz 2 beans are found
@Configuration
// Bean is built and it is injected in IntroductionToSpringBootApplication

public class AppConfig {

    @Bean
    @Scope("singleton")
    Apple getApple() {
        return new Apple();
    }
    //Above method the developer is taking care of creation of object not the spring framework
    // The spring framework will invoke the and inject the dependency.
}
