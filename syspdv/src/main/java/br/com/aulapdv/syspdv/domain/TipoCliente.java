package br.com.aulapdv.syspdv.domain;

public enum TipoCliente {
    CPF(1, "Pessoa Física"),
    CNPJ(2, "Pessoa Jurídica");

    Integer valor;
    String descricao;

    private TipoCliente(Integer valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    private TipoCliente() {
    }

    public Integer getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

}
