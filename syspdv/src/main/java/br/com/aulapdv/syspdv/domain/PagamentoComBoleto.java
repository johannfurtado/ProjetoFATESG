package br.com.aulapdv.syspdv.domain;

import java.time.LocalDate;

public class PagamentoComBoleto {
    
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    
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
    public PagamentoComBoleto(LocalDate dataVencimento, LocalDate dataPagamento) {
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    

}
