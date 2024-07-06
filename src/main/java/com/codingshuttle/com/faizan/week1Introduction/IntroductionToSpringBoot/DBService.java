package com.codingshuttle.com.faizan.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService implements DB{
    @Autowired
    DB db; //loose coupling achieved by interface

    public String getData() {
        return db.getData();
    }
}
