package br.com.aulapdv.syspdv.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private EstadoPagamento estado;
    
    @OneToOne(mappedBy="pagamento")
    private Pedido pedido;

    private PagamentoComCartao pagamentoComCartao;
    private PagamentoComBoleto PagamentoComBoleto;

    public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido, PagamentoComCartao pagamentoComCartao,
            br.com.aulapdv.syspdv.domain.PagamentoComBoleto pagamentoComBoleto) {
        this.id = id;
        this.estado = estado;
        this.pedido = pedido;
        this.pagamentoComCartao = pagamentoComCartao;
        PagamentoComBoleto = pagamentoComBoleto;
    }
    public Pagamento(){
    }

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
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    

}
