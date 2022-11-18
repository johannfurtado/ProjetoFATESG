package br.com.aulapdv.syspdv.domain;

import java.util.List;

public class Categoria {
    
    private Integer id;
    private String nome;

    private List<Produto> produtos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
}
