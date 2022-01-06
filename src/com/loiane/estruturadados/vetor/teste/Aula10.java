package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObject;

public class Aula10 {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(3);

        Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "3333-8888", "contato2@gmail.com");
        Contato c3 = new Contato("Contato 3", "3444-9999", "contato3@gmail.com");

        Contato c4 = new Contato("Contato 1", "1234-5678", "contato1@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.getTamanho());

        int pos = vetor.busca(c4);
        if (pos > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);
    }
}
