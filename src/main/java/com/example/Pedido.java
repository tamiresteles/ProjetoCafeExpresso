package com.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens;
    private StatusPedido status;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.status = StatusPedido.PENDENTE;
    }

    public void adicionarItem(Produto produto, int quantidade) {

        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void pagar() {

        if (status != StatusPedido.PENDENTE) {
            throw new IllegalStateException("Pedido já foi pago!");
        }

        status = StatusPedido.PAGO;
    }

    public void enviarParaCozinha() {

        if (status != StatusPedido.PAGO) {
            throw new IllegalStateException("Pedido precisa estar pago!");
        }

        status = StatusPedido.EM_PREPARO;
    }

    public void finalizarPedido() {

    if (itens.isEmpty()) {
        throw new IllegalStateException("Pedido sem itens!");
    }

    if (status != StatusPedido.EM_PREPARO) {
        throw new IllegalStateException("Pedido não está em preparo!");
    }

    status = StatusPedido.FINALIZADO;
}
    }

    public StatusPedido getStatus() {
        return status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}