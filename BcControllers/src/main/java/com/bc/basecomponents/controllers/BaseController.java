package com.bc.basecomponents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller(value = "/controllers")
public class BaseController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name, Model model){
        model.addAttribute("greeting", name);
        return "home";
    }

}
