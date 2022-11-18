package br.com.aulapdv.syspdv.domain;

import java.util.List;

public class Cliente {
    private Integer id;
    private String nome;
    private String email;
    private String cpfOuCnpj;

    private TipoCliente tipo;
    private List<Endereco> enderecos;
    private List<Telefone> telefones;
    private List<ItemPedido> ItensPedidos;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }
    public void setCpfOuCnpj(String cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }
    public List<Endereco> getEnderecos() {
        return enderecos;
    }
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    public List<Telefone> getTelefones() {
        return telefones;
    }
    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    public TipoCliente getTipo() {
        return tipo;
    }
    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
    public List<ItemPedido> getItensPedidos() {
        return ItensPedidos;
    }
    public void setItensPedidos(List<ItemPedido> itensPedidos) {
        ItensPedidos = itensPedidos;
    }
    public Cliente(Integer id, String nome, String email, String cpfOuCnpj, TipoCliente tipo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo;
    }
   
}
    


