package com.gennadziy.magazyn.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@Table
@Entity
public class Produkts {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
    private double rentabeln;
    private double bl_profit;
    private double clear_profit;
    private boolean ce;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_china = new Date();
    private String name_company;


    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "clients_id")
    private Clients clients;

}
