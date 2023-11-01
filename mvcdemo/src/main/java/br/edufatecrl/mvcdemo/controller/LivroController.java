package br.edufatecrl.mvcdemo.controller;

import br.edufatecrl.mvcdemo.models.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/livro")
public class LivroController {
    private static final List<Livro>
            livro = new ArrayList<Livro>();

    public LivroController() {
        livro.add(new Livro("Vidas Secas","Graciliano Ramos"));
        livro.add(new Livro("Dom Casmuro","Machado de Asis"));
        livro.add(new Livro("Dom Quixote","Miguel de Cervantes"));
    }

    @GetMapping
    public String getLivro(Model model)
    {
        model.addAttribute("livro",livro);
        return "livro";
    }
}