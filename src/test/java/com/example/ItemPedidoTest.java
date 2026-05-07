package com.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class ItemPedidoTest {

    @Test
    public void deveCriarItemPedido() {
        Produto produto = new Produto("Café", 5.0);
        ItemPedido item = new ItemPedido(produto, 2);

        assertNotNull(item);
    }
}