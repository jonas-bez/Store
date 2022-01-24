package com.example.store.resources;

import com.example.store.model.Compra;
import com.example.store.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins = "*")
public class CompraReource {

    @Autowired
    CompraRepository compraRepository;

    @GetMapping("/compra")
    public List<Compra> listarCompr(){
        return compraRepository.findAll();
    }

    @PostMapping("/compra")
    public Compra salvaCompra(@RequestBody Compra compra ){
        return compraRepository.save(compra);
    }

}
