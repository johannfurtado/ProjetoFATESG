package br.com.aulapdv.syspdv.domain;

public class PagamentoComCartao extends Pagamento {
    private Integer numeroDeParcelas;

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, PagamentoComCartao pagamentoComCartao,
            br.com.aulapdv.syspdv.domain.PagamentoComBoleto pagamentoComBoleto, Integer numeroDeParcelas) {
        super(id, estado, pagamentoComCartao, pagamentoComBoleto);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public PagamentoComCartao(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public PagamentoComCartao(){
    }
    
}
