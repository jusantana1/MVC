package br.edufatecrl.mvcdemo.controller;

import br.edufatecrl.mvcdemo.models.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/livro")
public class DadosController {
    private static final List<br.edufatecrl.mvcdemo.models.Livro>
            livro = new ArrayList<br.edufatecrl.mvcdemo.models.Livro>();

    public DadosController() {
        livro.add(new br.edufatecrl.mvcdemo.models.Livro("Vidas Secas","Graciliano Ramos"));
        livro.add(new br.edufatecrl.mvcdemo.models.Livro("Dom Casmuro","Machado de Asis"));
        livro.add(new br.edufatecrl.mvcdemo.models.Livro("Dom Quixote","Miguel de Cervantes"));
    }

    @GetMapping
    public List<Livro> getLivro()
    {
        return livro;
    }
}