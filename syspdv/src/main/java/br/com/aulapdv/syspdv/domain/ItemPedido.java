package br.com.aulapdv.syspdv.domain;

import br.com.aulapdv.syspdv.repository.ItemPedidoPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class ItemPedido {
    
    @EmbeddedId
    private ItemPedidoPK id;

    private Double desconto;
    private Integer quantidade;
    private Double preco;

    public ItemPedido(Double desconto, Integer quantidade, Double preco) {
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;

    }
    public ItemPedido() {
    }
    
    public Double getDesconto() {
        return desconto;
    }
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}