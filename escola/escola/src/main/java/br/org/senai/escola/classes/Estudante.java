package br.org.senai.escola.classes;


import jakarta.persistence.*;

@Entity
@Table(name = "estudante")

public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
}
