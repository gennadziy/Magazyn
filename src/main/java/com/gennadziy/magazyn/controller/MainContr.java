package com.gennadziy.magazyn.controller;

import com.gennadziy.magazyn.dao.ProduktDao;
import com.gennadziy.magazyn.model.Clients;
import com.gennadziy.magazyn.model.Produkts;
import com.gennadziy.magazyn.service.ClientService;
import com.gennadziy.magazyn.service.ProduktService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;


@Controller
@Slf4j
public class MainContr {

    @Autowired
    private ProduktDao produktDao;
    @Autowired
    private ProduktService produktService;

    @Autowired
    private ClientService clientService;

    @GetMapping
    public String allProdukts ( Model modelAndView ) {
        List<Produkts> produkts = produktService.all ();
        modelAndView.addAttribute ( "produkts", produkts );
        List<Clients> clients = clientService.all ();
        modelAndView.addAttribute ( "clients", clients );
        log.info ( "lkclsdjkclsdjkl", produkts );
        return "index";
    }
    @GetMapping("/add")
    public String addUser1() {
        return "add";
    }


    @GetMapping("/clients/{id}")
    public @ResponseBody
    Optional <Produkts> listClients( @PathVariable(value = "id") Long id) {
        return  produktDao.findById ( id );
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/add")
    public String addUser(Produkts produkts,  Model model, Clients clients) {
        produktService.add ( produkts );
        model.addAttribute("produkts", produktService.all ());
        return "redirect:/";
    }
    @GetMapping("/addClient")
    public String addClient() {
        return "addClient";
    }
    @PostMapping("/addClient")
    public String addClient( Model model, Clients clients) {
        clientService.add ( clients );
        model.addAttribute("clients", clientService.all ());
        return "redirect:/";
    }
}
