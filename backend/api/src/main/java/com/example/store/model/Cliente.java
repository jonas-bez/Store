package com.example.store.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="TB_CLIENTE")
public class Cliente {
    private static final long serialVersionID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String nome;

    private Date dataDeNascimento;

    @JsonIgnore
    @OneToOne
    private Compra compra;
}
