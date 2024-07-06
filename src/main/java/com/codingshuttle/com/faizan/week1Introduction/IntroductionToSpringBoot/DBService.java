package com.codingshuttle.com.faizan.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService implements DB{
//    @Autowired //Field Injection
//    DB db;

    //Constructor injection
    final private DB db;

    public DBService(DB db){
        this.db = db;
    }

    public String getData() {
        return db.getData();
    }
}
