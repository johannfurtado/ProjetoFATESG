package br.com.aulapdv.syspdv.repository;

import br.com.aulapdv.syspdv.domain.Pedido;
import br.com.aulapdv.syspdv.domain.Produto;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ItemPedidoPK {
    
    @ManyToOne
    @JoinColumn(name="PRODUTO_ID")
    Produto produto;

    @ManyToOne
    @JoinColumn(name="PEDIDO_ID")
    Pedido pedido;
}