package com.loiane.estruturadados.fila.labs;

import com.loiane.estruturadados.fila.Fila;
import com.loiane.estruturadados.fila.FilaComPrioridade;

public class Exer03 {

    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {

        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();

        fila.enfileira(new Pessoa("Pessoa 1", VERDE));
        fila.enfileira(new Pessoa("Pessoa 2", AMARELO));
        fila.enfileira(new Pessoa("Pessoa 3", VERMELHO));
        fila.enfileira(new Pessoa("Pessoa 4", VERDE));
        fila.enfileira(new Pessoa("Pessoa 5", VERDE));
        fila.enfileira(new Pessoa("Pessoa 6", VERMELHO));

        PSAtendimento psAtendimento = new PSAtendimento(fila);
        PSNovosPacientes psNovosPacientes = new PSNovosPacientes(fila);

        Thread t1 = new Thread(psAtendimento);
        Thread t2 = new Thread(psNovosPacientes);
        t1.start();
        t2.start();
    }

}
