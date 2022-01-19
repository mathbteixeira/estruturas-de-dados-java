package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.FilaComPrioridade;

import java.util.LinkedList;
import java.util.Queue;

public class Aula24 {
    public static void main(String[] args) {
        // Queue é uma interface
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileira(new Paciente("A", 2));
        fila.enfileira(new Paciente("B", 1));
        fila.enfileira(new Paciente("C", 3));

        System.out.println(fila);

        System.out.println(fila.desenfileira());

        System.out.println(fila);

    }
}
