package com.itb.inf2bm.pizzariab.controller;


import com.itb.inf2bm.pizzariab.model.entity.Produto;
import com.itb.inf2bm.pizzariab.model.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/*
 @RequestBody   : Corpo da Requisição ( Re)

*/

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    // Listar todos os produtos
    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {
        return ResponseEntity.ok(produtoService.findAll());

    }

    // Salvar Produto
    @PostMapping
    public ResponseEntity<Produto> save(@RequestBody Produto produto) {
        Produto novo = produtoService.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(novo);
    }


}
