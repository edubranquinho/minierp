package br.com.branquinho.minierp.produto.categoria.web.controller;

import br.com.branquinho.minierp.produto.categoria.business.repository.CategoriaRepository;
import br.com.branquinho.minierp.produto.categoria.model.Categoria;
import br.com.branquinho.minierp.produto.categoria.web.form.CategoriaForm;
import br.com.branquinho.minierp.produto.categoria.web.view.CategoriaView;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("categorias")
public class CategoriaController {

    private final CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarCategoria(@RequestBody CategoriaForm categoriaForm) {
        Categoria categoria = categoriaForm.toEntity();
        categoriaRepository.save(categoria);
    }

    @GetMapping
    public Collection<CategoriaView> listarCategorias() {
        return categoriaRepository
                .findAll()
                .stream()
                .map(categoria -> new CategoriaView(categoria.getCategoriaKey(), categoria.getDescricao()))
                .toList();

    }

}
