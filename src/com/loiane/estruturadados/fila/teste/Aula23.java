package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {
    public static void main(String[] args) {
        // Queue é uma interface
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1); //enqueue
        fila.add(2);

        System.out.println(fila);

        System.out.println(fila.peek()); // espiar

        System.out.println(fila.remove()); // dequeue

        System.out.println(fila);
    }
}
