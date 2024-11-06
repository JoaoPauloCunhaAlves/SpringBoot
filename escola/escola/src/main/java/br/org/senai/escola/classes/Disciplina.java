package br.org.senai.escola.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "disciplina")

public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cargaHoraria")
    private int cargaHoraria;
}
