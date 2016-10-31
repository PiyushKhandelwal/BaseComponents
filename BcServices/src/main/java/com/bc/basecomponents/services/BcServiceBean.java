package com.bc.basecomponents.services;


import javax.ejb.Stateless;

@Stateless
public class BcServiceBean implements BcService{

    public String sayHello(String name){
        return "Hello " + name;
    }
}
