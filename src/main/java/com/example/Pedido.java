package com.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Produto> itens = new ArrayList<>();

    // Adiciona um produto ao pedido
    public void adicionarProduto(Produto produto) {
        itens.add(produto);
    }

    // Calcula o valor total do pedido
    public double calcularTotal() {
        double total = 0;

        for (Produto p : itens) {
            total += p.getPreco();
        }

        return total;
    }

    // (Opcional) retorna a lista de itens
    public List<Produto> getItens() {
        return itens;
    }
}