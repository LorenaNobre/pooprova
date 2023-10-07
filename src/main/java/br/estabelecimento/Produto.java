package br.estabelecimento;

import java.util.Objects;

public class Produto {

    private Integer id;
    private String nome;
    private String descricao;
    private Double compra;
    private Double venda;
    private Double desconto;
    private String fabricante;

    public Produto() {

    }

    public void Produto (){

    }
    public Produto(Integer id, String nome, String descricao, Double compra, Double venda, Double desconto, String fabricante){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.compra = compra;
        this.venda = venda;
        this.desconto = desconto;
        this.fabricante = fabricante;

    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getCompra() {
        return compra;
    }

    public void setCompra(Double compra) {
        this.compra = compra;
    }

    public Double getVenda() {
        return venda;
    }

    public void setVenda(Double venda) {
        this.venda = venda;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", compra=" + compra +
                ", venda=" + venda +
                ", desconto=" + desconto +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }




}
