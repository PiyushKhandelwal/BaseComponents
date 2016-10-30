package com.bc.basecomponents.services;

import javax.ejb.Stateless;

@Stateless
public class BaseService {

    public String sayHello(String name){
        return "Hello " + name;
    }
}
