package com.itb.inf2bm.pizzariab.controller;

import com.itb.inf2bm.pizzariab.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {

    List<Categoria> categoria = new ArrayList<Categoria>();

    @GetMapping
    public List<Categoria> findAll() {

        Categoria c1 = new Categoria();
        c1.setId(java.lang.Long.valueOf(1));
        c1.setNome("Categoria de pizza");
        c1.setDescricao("Pizza de Calabresa");
        c1.setCodStatus(false);

        categoria.add(c1);
        return categoria;
    }
}
