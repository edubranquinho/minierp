package br.com.branquinho.minierp.produto.produto.business.factory;

import br.com.branquinho.minierp.core.exceptions.BusinessException;
import br.com.branquinho.minierp.produto.categoria.business.CategoriaService;
import br.com.branquinho.minierp.produto.categoria.model.Categoria;
import br.com.branquinho.minierp.produto.produto.model.Produto;
import br.com.branquinho.minierp.produto.produto.web.form.ProdutoForm;
import org.springframework.stereotype.Component;

@Component
public class ProdutoFactory {

    private final CategoriaService categoriaService;


    public ProdutoFactory(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    public Produto criarProduto(ProdutoForm produtoForm) {
        Categoria categoria = categoriaService
                .obterCategoria(produtoForm.categoriaKey())
                .orElseThrow(() -> new BusinessException("Categoria não encontrada"));

        Produto produto = new Produto();
        produto.setDescricao(produtoForm.descricao());
        produto.setCategoria(categoria);
        return produto;
    }

}