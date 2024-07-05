package com.codingshuttle.com.faizan.week1Introduction.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Component //Stereotype Method for beans
public class Apple {
    void eatApple() {
        System.out.println("I am eating an apple");
    }

    @PostConstruct
    void  callThisMethodBeforeAppleIsUsed(){
        System.out.println("Creating the apple before user");
    }

    @PreDestroy
    void callThisMethodBeforeDestroy(){
        System.out.println("Destroying the Apple bean");
    }
}
