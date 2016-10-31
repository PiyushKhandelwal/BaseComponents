package com.bc.basecomponents.controllers;

import com.bc.basecomponents.services.clients.BcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller(value = "/controllers")
public class BaseController {

    @Autowired
    private BcService bcService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name, Model model){
        model.addAttribute("greeting", bcService.sayHello(name));
        return "home";
    }

}
