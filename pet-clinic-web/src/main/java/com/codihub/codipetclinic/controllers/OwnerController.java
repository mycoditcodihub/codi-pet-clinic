package com.codihub.codipetclinic.controllers;

import com.codihub.codipetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//The advantage of having a RequestMapping added at the class level is that any request that comes in with /owner gets added to every RequestMapping in each method in this class
@RequestMapping("/owners")
@Controller
public class OwnerController {

    //We need to get an OwnerService object
    private final OwnerService ownerService;

    //Using constructor based
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
