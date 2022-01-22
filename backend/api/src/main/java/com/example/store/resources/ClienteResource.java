package com.example.store.resources;

import com.example.store.model.Cliente;
import com.example.store.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ClienteResource {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/cliente")
    public List<Cliente> listarProdutos(){
        return clienteRepository.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente listarUmProduto(@PathVariable(value = "id") long id){
        return clienteRepository.findById(id);
    }

    @PostMapping("/cliente")
    public Cliente salvaProduto(@RequestBody Cliente cliente ){
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/cliente")
    public void deletaProduto(@RequestBody Cliente cliente) {  clienteRepository.delete(cliente); }

    @PutMapping("/cliente")
    public void atualizarProduto(@RequestBody Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
