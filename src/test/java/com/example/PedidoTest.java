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
    pedido.adicionarProduto(p);

    assertEquals(10.0, pedido.calcularTotal());
}
@Test
void deveSomarDoisProdutos() {
    Pedido pedido = new Pedido();

    pedido.adicionarProduto(new Produto("Café", 10.0));
    pedido.adicionarProduto(new Produto("Pão", 5.0));

    assertEquals(15.0, pedido.calcularTotal());
}
@Test
void deveSomarVariosProdutos() {
    Pedido pedido = new Pedido();

    pedido.adicionarProduto(new Produto("Café", 10.0));
    pedido.adicionarProduto(new Produto("Pão", 5.0));
    pedido.adicionarProduto(new Produto("Leite", 7.0));

    assertEquals(22.0, pedido.calcularTotal());
}
}