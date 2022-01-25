package com.example.store.repository;

import com.example.store.model.Cliente;
import com.example.store.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {
    Compra findById(long id);
    @Query(value = "select * from tb_compra where TO_CHAR(data_compra, 'MM') =?1", nativeQuery = true)
    List<Compra> findByMonth(@Param("month") String month);
}
