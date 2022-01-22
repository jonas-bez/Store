package com.example.store.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@Entity
@Table(name="TB_PRODUTO")
public class Produto implements Serializable {

    private static final long serialVersionID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nome;
    private int quantidade;
    private int valor;

    @JsonIgnore
    @ManyToOne
    private Compra compras;
}

