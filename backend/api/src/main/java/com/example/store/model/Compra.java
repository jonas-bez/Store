package com.example.store.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name="TB_COMPRA")
public class Compra {
    private static final long serialVersionID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @OneToOne
    private Cliente cliente;

    @OneToOne
    private Produto poduto;

    private int quantidade;

    @DateTimeFormat
    private LocalDateTime dataCompra;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compra compra = (Compra) o;
        return id == compra.id && quantidade == compra.quantidade && Objects.equals(cliente, compra.cliente) && Objects.equals(poduto, compra.poduto) && Objects.equals(dataCompra, compra.dataCompra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cliente, poduto, quantidade, dataCompra);
    }
}
