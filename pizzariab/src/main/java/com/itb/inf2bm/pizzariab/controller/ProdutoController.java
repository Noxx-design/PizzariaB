package com.itb.inf2bm.pizzariab.controller;


import com.itb.inf2bm.pizzariab.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    List<Produto> produtos = new ArrayList<Produto>();

    @GetMapping
    public List<Produto> findAll() {

        Produto p1 = new Produto();
        p1.setId(java.lang.Long.valueOf(1));
        p1.setNome("Pizza de Calabresa");
        p1.setDescricao("Pizza de Calabresa com bastante cebola");
        p1.setValorCompra(49.90);
        p1.setValorVenda(49.90);
        p1.setQuantidadeEstoque(999);
        p1.setCodStatus(false);

        produtos.add(p1);
        return produtos;
    }

}
