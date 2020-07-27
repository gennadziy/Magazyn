package com.gennadziy.magazyn.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@Table
@Entity
public class Produkts implements Serializable {

    static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date = new Date();
    private double cost_of_delivery;
    private double cost_of_custom;
    private double cost_of_deliver;
    private double cost_all;
    private double price_konk;
    private double price_our;


    public String getName () {
        return name.toUpperCase ();
    }
}
