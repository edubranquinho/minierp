package br.com.branquinho.minierp.produto.categoria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoriaKey;
    private String descricao;

    public int getCategoriaKey() {
        return categoriaKey;
    }

    public void setCategoriaKey(int categoriaKey) {
        this.categoriaKey = categoriaKey;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
