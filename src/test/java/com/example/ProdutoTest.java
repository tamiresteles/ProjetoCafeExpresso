package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    void deveCriarProdutoValido() {
       Produto p = new Produto ("café", 10.0);
        assertEquals("Café", p.getNome());
        assertEquals(10.0, p.getPreco());
    }
}