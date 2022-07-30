package br.com.branquinho.minierp.produto.categoria.business.repository;

import br.com.branquinho.minierp.produto.categoria.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
