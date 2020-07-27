package com.gennadziy.magazyn.dao;

import com.gennadziy.magazyn.model.Produkts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduktDao extends JpaRepository<Produkts, Long> {

}
