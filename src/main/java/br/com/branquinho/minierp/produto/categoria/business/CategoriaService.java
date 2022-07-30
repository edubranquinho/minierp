package br.com.branquinho.minierp.produto.categoria.business;

import br.com.branquinho.minierp.produto.categoria.business.repository.CategoriaRepository;
import br.com.branquinho.minierp.produto.categoria.model.Categoria;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Optional<Categoria> obterCategoria(int categoriaKey) {
        return categoriaRepository.findById(categoriaKey);
    }
}
