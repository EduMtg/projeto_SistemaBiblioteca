package com.ger.biblioteca.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LivroController {
    @GetMapping("/")
    public String inicio() {
        return "livros/inicio";
    }

    @GetMapping("/cadastroLivros")
    public String cadastrarLivros(Model model){
        return "livros/cadastroLivros";
    }

    @PostMapping ("/livros/confirmacaoLivro")
    public String confirmacaoLivro(
            @RequestParam String titulo,
            @RequestParam String autor,
            @RequestParam String isbn,
            Model model) {
                model.addAttribute("titulo", titulo);
                model.addAttribute("autor", autor);
                model.addAttribute("isbn", isbn);
                return "livros/confirmacaoLivro";
            }

    @GetMapping("/autores")
    public String autores() {
        return "livros/autores";
    }

    @PostMapping ("/livros/confirmacaoAutor")
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

    @GetMapping("/categorias")
    public String categorias() {
        return "livros/categorias";
    }

    @GetMapping("/emprestimos")
    public String emprestimos() {
        return "livros/emprestimos";
    }

    @GetMapping("/usuarios")
    public String usuarios() {
        return "livros/usuarios";
    }
}