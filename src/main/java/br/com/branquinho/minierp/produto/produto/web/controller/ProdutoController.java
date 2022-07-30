package br.com.branquinho.minierp.produto.produto.web.controller;

import br.com.branquinho.minierp.produto.produto.business.service.ProdutoService;
import br.com.branquinho.minierp.produto.produto.model.Produto;
import br.com.branquinho.minierp.produto.produto.web.form.ProdutoForm;
import br.com.branquinho.minierp.produto.produto.web.view.ProdutoView;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ProdutoView criarProduto(@RequestBody ProdutoForm produtoForm) {
        Produto produto = produtoService.criarProduto(produtoForm);
        return new ProdutoView(produto.getProdutoKey(), produto.getDescricao(), produto.getCategoria().getDescricao());
    }

    @GetMapping
    public List<ProdutoView> listar() {
        return produtoService
                .listar()
                .stream()
                .map(produto -> new ProdutoView(produto.getProdutoKey(), produto.getDescricao(), produto.getCategoria().getDescricao()))
                .toList();
    }

}
