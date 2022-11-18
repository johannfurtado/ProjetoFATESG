package br.com.aulapdv.syspdv.domain;

public class ItemPedido {
    
    private Double desconto;
    private Integer quantidade;
    private Double preco;

    private Pedido pedido;
    private Produto produto;
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
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public ItemPedido(Double desconto, Integer quantidade, Double preco, Pedido pedido, Produto produto) {
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.pedido = pedido;
        this.produto = produto;
    }

}