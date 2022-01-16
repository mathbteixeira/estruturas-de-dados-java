package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);

        Livro livro1 = new Livro();
        livro1.setNome("Livro 1");
        livro1.setAutor("Autor");
        livro1.setAnoLancamento(2016);
        livro1.setIsbn("isbn1");

        Livro livro2 = new Livro();
        livro2.setNome("Livro 2");
        livro2.setAutor("Autor");
        livro2.setAnoLancamento(2011);
        livro2.setIsbn("isbn2");

        Livro livro3 = new Livro();
        livro3.setNome("Livro 3");
        livro3.setAutor("Autor");
        livro3.setAnoLancamento(2002);
        livro3.setIsbn("isbn3");

        Livro livro4 = new Livro();
        livro4.setNome("Livro 4");
        livro4.setAutor("Autor");
        livro4.setAnoLancamento(2000);
        livro4.setIsbn("isbn4");

        System.out.println("Pilha de livros criada. Pilha esta vazia? " + pilha.estaVazia());

        System.out.println("Empilhando livros na pilha.");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);

        System.out.println("Espiando o topo da pilha " + pilha.topo());

        System.out.println(pilha.tamanho() + " livros foram empilhados");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada. Pilha esta vazia? " + pilha.estaVazia());
        System.out.println("Desempilhando livros da pilha.");

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando livro " + pilha.desempilha());
        }
        System.out.println("Todos os livros foram desempilhados. Pilha vazia? " + pilha.estaVazia());
    }
}
