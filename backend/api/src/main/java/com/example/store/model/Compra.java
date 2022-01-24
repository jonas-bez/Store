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
@Table(name="TB_COMPRA")
public class Compra {
    private static final long serialVersionID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Produto podutos;

    private int quantidade;

    @DateTimeFormat
    private LocalDateTime dataCompra;
}
