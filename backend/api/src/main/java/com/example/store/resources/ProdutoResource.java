package com.example.store.resources;

import com.example.store.model.Produto;
import com.example.store.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produto")
    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping("/produto/{id}")
    public Produto listarUmProduto(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);
    }

    @PostMapping("/produto")
    public Produto salvaProduto(@RequestBody Produto produto ){
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    public void deletaProduto(@RequestBody Produto produto) {  produtoRepository.delete(produto); }

    @PutMapping("/produto")
    public void atualizarProduto(@RequestBody Produto produto) {
        produtoRepository.save(produto);
    }
}
