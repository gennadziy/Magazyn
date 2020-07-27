package com.gennadziy.magazyn.service;

import com.gennadziy.magazyn.dao.ProduktDao;
import com.gennadziy.magazyn.model.Produkts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProduktServiceImpl implements ProduktService {

    @Autowired
    private ProduktDao produktDao;

    @Override
    public List<Produkts> all () {
        return produktDao.findAll ();
    }

    @Override
    public Produkts add ( Produkts produkts ) {
        return produktDao.save ( produkts );
    }
}
