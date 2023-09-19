package com.example.ecommerceapi.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    Integer idClient;

    String lastName;
    String firstName;
    String email;
    String password;

    @OneToMany(mappedBy = "client",fetch = FetchType.EAGER)
    List<Card> cards;



}
