package com.gennadziy.magazyn.service;

import com.gennadziy.magazyn.model.Clients;
import com.gennadziy.magazyn.model.Produkts;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    List<Clients> all ();
    Clients add ( Clients clients );
}
