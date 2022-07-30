package br.com.branquinho.minierp.produto.categoria.web.form;

import br.com.branquinho.minierp.produto.categoria.model.Categoria;

public record CategoriaForm(String descricao) {

    public Categoria toEntity() {
        Categoria categoria = new Categoria();
        categoria.setDescricao(descricao);
        return categoria;
    }
}
