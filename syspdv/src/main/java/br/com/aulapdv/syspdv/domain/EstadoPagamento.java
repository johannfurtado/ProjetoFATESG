package br.com.aulapdv.syspdv.domain;

public enum EstadoPagamento {
    PAGO(1, "Pago"),
    PROCESSANDO(2, "Em Processamento"),
    CANCELADO(3,"Cancelado");

    Integer valor;
    String descricao;

    private EstadoPagamento(Integer valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public Integer getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    private EstadoPagamento() {
    }
    
}
