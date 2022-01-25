package com.example.store.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id && Objects.equals(nome, cliente.nome) && Objects.equals(dataDeNascimento, cliente.dataDeNascimento) && Objects.equals(compra, cliente.compra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dataDeNascimento, compra);
    }
}
