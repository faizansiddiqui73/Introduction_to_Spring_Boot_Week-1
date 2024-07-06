package com.codingshuttle.com.faizan.week1Introduction.IntroductionToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class DevDB implements DB {

    @Override
    public String getData() {
        return "Dev Data";
    }
}
