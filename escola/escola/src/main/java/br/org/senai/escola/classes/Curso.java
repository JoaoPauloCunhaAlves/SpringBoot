package br.org.senai.escola.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "curso")

public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "duracao")
    private int duracao;
}
