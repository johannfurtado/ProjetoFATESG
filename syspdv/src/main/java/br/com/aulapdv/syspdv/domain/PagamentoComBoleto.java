package br.com.aulapdv.syspdv.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class PagamentoComBoleto extends Pagamento{
    
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;

    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, PagamentoComCartao pagamentoComCartao,
            PagamentoComBoleto pagamentoComBoleto, LocalDate dataVencimento, LocalDate dataPagamento) {
        super(id, estado, pedido, pagamentoComCartao, pagamentoComBoleto);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public PagamentoComBoleto(LocalDate dataVencimento, LocalDate dataPagamento) {
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }
    public PagamentoComBoleto() {
    }
    
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public LocalDate getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
}
