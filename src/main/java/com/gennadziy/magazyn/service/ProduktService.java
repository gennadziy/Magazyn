package com.gennadziy.magazyn.service;

import com.gennadziy.magazyn.model.Produkts;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProduktService  {
    List<Produkts> all();
    Produkts add(Produkts produkts);
}
