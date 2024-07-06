package com.codingshuttle.com.faizan.week1Introduction.IntroductionToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class ProdDB implements DB {
    public String getData() {
        return "Production Data";
    }
}
