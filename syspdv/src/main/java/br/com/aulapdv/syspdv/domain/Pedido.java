package br.com.aulapdv.syspdv.domain;

import java.time.LocalDate;
import java.util.List;


public class Pedido {
    
    private Integer id;
    private LocalDate instante;

    private Pagamento pagamento;
    private List<ItemPedido> itensPedidos;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDate getInstante() {
        return instante;
    }
    public void setInstante(LocalDate instante) {
        this.instante = instante;
    }
    public Pagamento getPagamento() {
        return pagamento;
    }
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    public List<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }
    public void setItensPedidos(List<ItemPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }
    public Pedido(Integer id, LocalDate instante, Pagamento pagamento) {
        this.id = id;
        this.instante = instante;
        this.pagamento = pagamento;
    }

    

}
