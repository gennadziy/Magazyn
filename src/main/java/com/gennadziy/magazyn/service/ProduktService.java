package com.gennadziy.magazyn.service;

import com.gennadziy.magazyn.model.Produkts;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@Author Gennadziy GITHUB/gennadziy
Class name: ProduktService
Date: 2020-07-22
Time: 17:29
*/
@Service
public interface ProduktService  {
    List<Produkts> all();
    Produkts add(Produkts produkts);
}
