package com.company;

public class Produto {

    private float valor = 0;
    private int quantidade = 1;
    private String nome = "";

    public Produto(String nome, float valorUnitario, int quantidade){
        this.valor = valorUnitario;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(String nome, float valorUnitario){
        this.nome = nome;
        this.valor = valorUnitario;
    }

    public float getTotal(){
        return valor * quantidade;
    }

}
