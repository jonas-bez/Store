package com.example.store.resources;

import com.example.store.model.Cliente;
import com.example.store.repository.ClienteRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Clientes")
@CrossOrigin(origins = "*")
public class ClienteResource {

    @Autowired
    ClienteRepository clienteRepository;

    @ApiOperation(value="Retorna uma lista de clientes")
    @GetMapping("/cliente")
    public List<Cliente> listarCliente(){
        return clienteRepository.findAll();
    }

    @ApiOperation(value="Retorna um cliente unico")
    @GetMapping("/cliente/{id}")
    public Cliente listarUmCliente(@PathVariable(value = "id") long id){
        return clienteRepository.findById(id);
    }

    @ApiOperation(value="Salva um cliente")
    @PostMapping("/cliente")
    public Cliente salvaCliente(@RequestBody Cliente cliente ){
        return clienteRepository.save(cliente);
    }

    @ApiOperation(value="Deleta um cliente")
    @DeleteMapping("/cliente")
    public void deletaCliente(@RequestBody Cliente cliente) {  clienteRepository.delete(cliente); }

    @ApiOperation(value="Atualiza um cliente")
    @PutMapping("/cliente")
    public void atualizarCliente(@RequestBody Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
