package com.example.store.repository;

import com.example.store.model.Cliente;
import com.example.store.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra, Long> {
    Compra findById(long id);
}
