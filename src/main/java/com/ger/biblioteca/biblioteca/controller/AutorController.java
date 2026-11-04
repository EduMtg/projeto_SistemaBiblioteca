package com.ger.biblioteca.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AutorController {
    @GetMapping("/autores")
    public String autores() {
        return "livros/autores";
    }

    @PostMapping("/livros/confirmacaoAutor")
    public String confirmacaoAutor(
            @RequestParam String nome,
            @RequestParam String nacionalidade,
            @RequestParam int qtdLivrosPublicados,
            Model model) {
        model.addAttribute("nome", nome);
        model.addAttribute("nacionalidade", nacionalidade);
        model.addAttribute("qtdLivrosPublicados", qtdLivrosPublicados);
        return "livros/confirmacaoAutor";
    }
}
