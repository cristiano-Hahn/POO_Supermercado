package com.company;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    public static void main(String[] args) {

        List<Pedido> pedidos = new ArrayList();
        Pedido itemPedido;
        float totalPedidos = 0;

       itemPedido = new Pedido();
        itemPedido.setCodigo(1);
        itemPedido.addProduto("Queijo", 5, 2.5f);
        itemPedido.addProduto("Fruta", 3, 2f);
        itemPedido.addProduto("Salada", 5, 4.56f);
        itemPedido.setFormaPagamento(Pedido.formaPagto.fpCheque);
        pedidos.add(itemPedido);

        itemPedido = new Pedido();
        itemPedido.setCodigo(2);
        itemPedido.addProduto("Massa", 2, 4.5f);
        itemPedido.addProduto("Carne", 3, 2.2f);
        itemPedido.addProduto("Miojo", 5, 4f);
        itemPedido.setFormaPagamento(Pedido.formaPagto.fpCartao);
        pedidos.add(itemPedido);

        for ( Pedido item: pedidos) {
            totalPedidos += item.getValorTotal();
        }

        System.out.println("O valor total é: " + totalPedidos);

        for ( Pedido item: pedidos) {
            System.out.println("Código do pedido: " + item.getCodigo());
            System.out.println("Valor total do pedido: " + item.getValorTotal());
        }
    }
}
