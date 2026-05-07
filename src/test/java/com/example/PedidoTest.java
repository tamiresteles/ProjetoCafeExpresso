package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

@Test
void deveRetornarZeroQuandoNaoTemItens() {
    Pedido pedido = new Pedido();

    assertEquals(0.0, pedido.calcularTotal());
}
@Test
void deveCalcularTotalComUmProduto() {
    Pedido pedido = new Pedido();

    Produto p = new Produto("Café", 10.0);
    pedido.adicionarItem(p, 1);

    assertEquals(10.0, pedido.calcularTotal());
}
@Test
void deveSomarDoisProdutos() {
    Pedido pedido = new Pedido();

    pedido.adicionarItem(new Produto("Café", 10.0), 1);
    pedido.adicionarItem(new Produto("Pão", 5.0), 1);

    assertEquals(15.0, pedido.calcularTotal());
}
@Test
void deveSomarVariosProdutos() {
    Pedido pedido = new Pedido();

    pedido.adicionarItem(new Produto("Café", 10.0), 1);
    pedido.adicionarItem(new Produto("Pão", 5.0), 1);
    pedido.adicionarItem(new Produto("Leite", 7.0), 1);
    assertEquals(22.0, pedido.calcularTotal());
}
}