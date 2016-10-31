package com.bc.basecomponents.services;

import com.bc.basecomponents.services.clients.BcService;

import javax.ejb.Stateless;

@Stateless
public class BcServiceBean implements BcService{

    public String sayHello(String name){
        return "Hello " + name;
    }
}
