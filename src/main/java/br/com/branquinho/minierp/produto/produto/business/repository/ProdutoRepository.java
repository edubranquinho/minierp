package br.com.branquinho.minierp.produto.produto.business.repository;

import br.com.branquinho.minierp.produto.produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
