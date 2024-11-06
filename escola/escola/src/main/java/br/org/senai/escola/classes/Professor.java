package br.org.senai.escola.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "professor")

public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "departamento")
    private String departamento;
}
