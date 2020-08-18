package com.gennadziy.magazyn.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Table
@Entity
public class Clients  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_pokup = new Date();
    private String name;
    private String surname;
    private String sity;
    private String street;
    private String house;
    private int number_house;
    private long phone_number;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="clients")
    @Basic(optional = false)
    private Set<Produkts> items;


}
