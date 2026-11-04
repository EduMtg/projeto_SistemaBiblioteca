package com.ger.biblioteca.biblioteca.controller;

import com.ger.biblioteca.biblioteca.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LivroController {
    List <Livro> livros = new ArrayList<>();

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("livros", livros);
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
                livros.add(new Livro(titulo, autor, isbn));
                return "livros/confirmacaoLivro";
            }

    @GetMapping("/excluir/{indice}")
    public String excluir(@PathVariable int indice){
        livros.remove(indice);
        return "redirect:/";
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