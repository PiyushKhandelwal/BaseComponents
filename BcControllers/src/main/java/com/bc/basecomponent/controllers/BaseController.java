package com.bc.basecomponent.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "/controllers")
public class BaseController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ModelAndView getProperties(@PathVariable("name") String name){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("name",name);
        return mv;
    }

}
