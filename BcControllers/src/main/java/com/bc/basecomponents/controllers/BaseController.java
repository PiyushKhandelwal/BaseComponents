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

    @RequestMapping(method = RequestMethod.GET)
    public String welcome(Model model){
        model.addAttribute("title", "Base Components");
        model.addAttribute("message", "This is welcome page!");
        return "welcome";
    }

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

    @RequestMapping(value = "/dba", method = RequestMethod.GET)
    public String welcomeDba(Model model){
        model.addAttribute("title", "Base Components");
        model.addAttribute("message", "This is DBA page!");
        return "home";
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name, Model model){
        model.addAttribute("title", "Base Components");
        model.addAttribute("message", bcService.sayHello(name));
        return "home";
    }
}
