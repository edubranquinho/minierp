package br.com.branquinho.minierp.produto.produto.model;

import br.com.branquinho.minierp.produto.categoria.model.Categoria;

import javax.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long produtoKey;
    private String descricao;
    @ManyToOne
    private Categoria categoria;

    public long getProdutoKey() {
        return produtoKey;
    }

    public void setProdutoKey(long produtoKey) {
        this.produtoKey = produtoKey;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
