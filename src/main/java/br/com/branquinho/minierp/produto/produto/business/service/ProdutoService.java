package br.com.branquinho.minierp.produto.produto.business.service;

import br.com.branquinho.minierp.produto.produto.business.factory.ProdutoFactory;
import br.com.branquinho.minierp.produto.produto.business.repository.ProdutoRepository;
import br.com.branquinho.minierp.produto.produto.model.Produto;
import br.com.branquinho.minierp.produto.produto.web.form.ProdutoForm;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class ProdutoService {

    private final ProdutoFactory produtoFactory;
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoFactory produtoFactory, ProdutoRepository produtoRepository) {
        this.produtoFactory = produtoFactory;
        this.produtoRepository = produtoRepository;
    }

    @Transactional
    public Produto criarProduto(ProdutoForm produtoForm) {
        Produto produto = produtoFactory.criarProduto(produtoForm);
        return produtoRepository.save(produto);
    }

    public Collection<Produto> listar() {
        return produtoRepository.findAll();
    }
}
