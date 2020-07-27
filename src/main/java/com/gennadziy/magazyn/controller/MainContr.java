package com.gennadziy.magazyn.controller;

import com.gennadziy.magazyn.model.Produkts;
import com.gennadziy.magazyn.service.ProduktService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainContr {

    @Autowired
    private ProduktService produktService;

    @GetMapping
    public String allProdukts ( Model modelAndView ) {
        List<Produkts> produkts = produktService.all ();
        modelAndView.addAttribute ( "produkts", produkts );
        return "index";
    }
    @GetMapping("/add")
    public String addUser1() {
        return "add";
    }

    @PostMapping("/add")
    public String addUser(Produkts produkts,  Model model) {
        produktService.add ( produkts );
        model.addAttribute("produkts", produktService.all ());
        return "redirect:/";
    }
}
