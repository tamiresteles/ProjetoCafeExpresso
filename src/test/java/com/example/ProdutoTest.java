package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    void deveCriarProdutoValido() {
        Produto p = new Produto("Café", 10.0);

        assertEquals("Café", p.getNome());
        assertEquals(10.0, p.getPreco());
    }

    @Test
    void naoDevePermitirNomeVazio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Produto("", 10.0);
        });
    }

    @Test
    void naoDevePermitirPrecoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Produto("Café", -5.0);
        });
    }
}