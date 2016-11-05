package com.bc.basecomponents.controllers;

import com.bc.basecomponents.services.clients.BcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller(value = "/")
public class BaseController {

    @Autowired
    private BcService bcService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String welcomeAdmin(Model model){
        model.addAttribute("title", "Base Components");
        model.addAttribute("message", "This is Admin page!");
        return "home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String welcome(Model model){
        model.addAttribute("title", "Base Components");
        model.addAttribute("message", "This is home page!");
        return "home";
    }
}
