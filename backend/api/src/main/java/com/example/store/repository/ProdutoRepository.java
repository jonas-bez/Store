package com.example.store.repository;

import com.example.store.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findById(long id);
}
