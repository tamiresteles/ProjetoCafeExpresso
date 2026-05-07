package com.example;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {

        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio!");
        }

        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo!");
        }
<<<<<<< HEAD
          this.nome = nome;
=======
>>>>>>> 17418ee90c9c60e848eed2269c0b9e2c125f84ff
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

        