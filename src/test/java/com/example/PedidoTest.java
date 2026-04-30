@Test
void deveRetornarZeroQuandoNaoTemItens() {
    Pedido pedido = new Pedido();

    assertEquals(0.0, pedido.calcularTotal());
}