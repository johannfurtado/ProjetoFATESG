package br.com.aulapdv.syspdv.domain;

import jakarta.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento {

    private Integer numeroDeParcelas;

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, PagamentoComCartao pagamentoComCartao,
            br.com.aulapdv.syspdv.domain.PagamentoComBoleto pagamentoComBoleto, Integer numeroDeParcelas) {
        super(id, estado, pedido, pagamentoComCartao, pagamentoComBoleto);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public PagamentoComCartao(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public PagamentoComCartao() {
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

}
