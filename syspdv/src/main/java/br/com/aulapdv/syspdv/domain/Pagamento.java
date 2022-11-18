package br.com.aulapdv.syspdv.domain;

public class Pagamento {
    
    private Integer id;

    private EstadoPagamento estado;
    private PagamentoComCartao pagamentoComCartao;
    private PagamentoComBoleto PagamentoComBoleto;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public EstadoPagamento getEstado() {
        return estado;
    }
    public void setEstado(EstadoPagamento estado) {
        this.estado = estado;
    }
    public PagamentoComCartao getPagamentoComCartao() {
        return pagamentoComCartao;
    }
    public void setPagamentoComCartao(PagamentoComCartao pagamentoComCartao) {
        this.pagamentoComCartao = pagamentoComCartao;
    }
    public PagamentoComBoleto getPagamentoComBoleto() {
        return PagamentoComBoleto;
    }
    public void setPagamentoComBoleto(PagamentoComBoleto pagamentoComBoleto) {
        PagamentoComBoleto = pagamentoComBoleto;
    }
    public Pagamento(Integer id, EstadoPagamento estado, PagamentoComCartao pagamentoComCartao,
            br.com.aulapdv.syspdv.domain.PagamentoComBoleto pagamentoComBoleto) {
        this.id = id;
        this.estado = estado;
        this.pagamentoComCartao = pagamentoComCartao;
        PagamentoComBoleto = pagamentoComBoleto;
    }
    
    

}
