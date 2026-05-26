package com.example.adocao.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pet")
public class pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String raca;
    private int idade;
}
