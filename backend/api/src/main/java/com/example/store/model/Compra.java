package com.example.store.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="TB_PRODUTO")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compras", fetch = FetchType.LAZY)
    private List<Produto> podutos;

    private int quantidade;

    @DateTimeFormat
    private LocalDateTime dataCompra;
}
