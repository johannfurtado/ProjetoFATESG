package br.com.aulapdv.syspdv.domain;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    private LocalDate instante;
    

    @ManyToOne
    @JoinColumn(name="CLI_ID")
    private Cliente cliente;

    @OneToMany
    private List<ItemPedido> itensPedidos;

    @OneToOne
    @JoinColumn(name="PAGAMENTO_ID")
    private Pagamento pagamento;

    @OneToOne
    @JoinColumn(name="ENDERECO_ID")
    private Endereco enderecoDeEntrega;
    
    public Pedido(Integer id, LocalDate instante, Pagamento pagamento, Cliente cliente, Endereco enderecoDeEntrega) {
        this.id = id;
        this.instante = instante;
        this.pagamento = pagamento;
        this.cliente = cliente;
        this.enderecoDeEntrega = enderecoDeEntrega;
    }
    public Pedido() {
    }

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
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Endereco getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }
    public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

}
