package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

public class Exer04 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();

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

        System.out.println("Pilha de livros criada. Pilha esta vazia? " + pilha.isEmpty());

        System.out.println("Empilhando livros na pilha.");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);

        System.out.println("Espiando o topo da pilha " + pilha.peek());

        System.out.println(pilha.size() + " livros foram empilhados");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada. Pilha esta vazia? " + pilha.isEmpty());
        System.out.println("Desempilhando livros da pilha.");

        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando livro " + pilha.pop());
        }
        System.out.println("Todos os livros foram desempilhados. Pilha vazia? " + pilha.isEmpty());
    }
}
