package com.example.store.controller;

import com.example.store.model.Cliente;
import com.example.store.model.Compra;
import com.example.store.repository.CompraRepository;

import java.util.Collections;
import java.util.List;

public class CompraController {

    public static Cliente getGanhador(List<Compra> compras){
        Cliente cliente = new Cliente();
        int maior = 0;
        for (Compra compra: compras) {
            int clienteMaisCompra = Collections.frequency(compras, compra.getCliente().getId());
            if(clienteMaisCompra > maior){
                maior = clienteMaisCompra;
                cliente = compra.getCliente();
            }
        }
        return cliente;
    }

}
