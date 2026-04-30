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
        this.nome = nome;
>>>>>>> c367e8d1d2a989f07da31cf59639e4d8e6cb9fc1
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

        