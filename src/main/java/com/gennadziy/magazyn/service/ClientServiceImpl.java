package com.gennadziy.magazyn.service;

import com.gennadziy.magazyn.dao.ClientDao;
import com.gennadziy.magazyn.dao.ProduktDao;
import com.gennadziy.magazyn.model.Clients;
import com.gennadziy.magazyn.model.Produkts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public List<Clients> all () {
        return clientDao.findAll ();
    }

    @Override
    public Clients add ( Clients clients ) {return clientDao.save ( clients );
    }
}
