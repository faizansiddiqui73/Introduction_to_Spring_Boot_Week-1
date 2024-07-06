package com.codingshuttle.com.faizan.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {


    @Autowired
    private DevDB devDB; //tightly Coupled

    String getData() {
        return devDB.getData();
    }
}
