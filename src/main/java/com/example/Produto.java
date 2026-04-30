package com.example;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {

        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio!");
        }

        