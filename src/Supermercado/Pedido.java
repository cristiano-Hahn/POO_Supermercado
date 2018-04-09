package com.company;

import java.util.*;


public class Pedido {
    public enum formaPagto {
        fpCartao, fpDinheiro, fpCheque
    }

    private List<Produto> itens = new ArrayList();
    private formaPagto formaPagamento;
    private Boolean formaPagtoInst = false;
    private int codigo = 0;

    public void addProduto(String nome, int quantidade, float valor){
        itens.add(new Produto(nome, valor, quantidade));
    }

    public float getValorTotal() {
        float total = 0;
        for (Produto item : itens) {
            total += item.getTotal();
        }
        return total;
    }

    public void setFormaPagamento(formaPagto value){
        this.formaPagamento = value;
        formaPagtoInst = true;
    }

    public formaPagto getFormaPagamento(){
        if (! formaPagtoInst){
            System.out.println("Informe a forma de pagamento!");
        }
        return formaPagamento;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void listarItens(){
         for ( Produto item: itens) {
            System.out.println("Nome do produto: " + item.getNome());
            System.out.println("Quantidade do produto: " + item.getQuantidade());
            System.out.println("Valor do produto: " + item.getValor());
        }
    }
}
