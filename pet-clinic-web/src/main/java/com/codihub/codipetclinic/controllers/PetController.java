package com.codihub.codipetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//The advantage of having a RequestMapping added at the class level is that any request that comes in with /owner gets added to every RequestMapping in each method in this class
@RequestMapping("/owners")
@Controller
public class PetController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(){

        return "owners/index";
    }
}
