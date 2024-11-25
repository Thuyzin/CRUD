package br.senac.sp.produto.controller.mvc;

import br.senac.sp.produto.repository.ProdutoRepository;
import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("produtos")
public class ProdutoControllerMvc {

    private final ProdutoRepository produtoRepository;

    public ProdutoControllerMvc(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public String exibirPaginaInicial(Model model){
        return "index";
    }

}
