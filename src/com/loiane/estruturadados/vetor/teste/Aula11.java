package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista;

public class Aula11 {
    public static void main(String[] args) {

        Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "3333-8888", "contato2@gmail.com");

        Lista<Contato> vetor = new Lista<>(1);

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        System.out.println(vetor);
    }
}
