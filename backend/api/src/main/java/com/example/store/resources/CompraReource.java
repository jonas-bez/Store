package com.example.store.resources;

import com.example.store.model.Compra;
import com.example.store.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class CompraReource {

    @Autowired
    CompraRepository compraRepository;

    @GetMapping("/compra")
    public List<Compra> listarProdutos(){
        return compraRepository.findAll();
    }

    @PostMapping("/compra")
    public Compra salvaProduto(@RequestBody Compra compra ){
        System.out.print(compra);
        return compraRepository.save(compra);
    }

}
