package com.loiane.estruturadados.fila.labs;

import com.loiane.estruturadados.fila.FilaComPrioridade;

import java.util.Random;

public class PSNovosPacientes implements Runnable {

    private FilaComPrioridade<Pessoa> fila;
    private int cont = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes(FilaComPrioridade<Pessoa> filaComPrioridade) {
        this.fila = filaComPrioridade;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa("Pessoa " + cont, prioridade.nextInt(3));
                fila.enfileira(p);
                cont++;
                System.out.println(p + " enfileirada.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
