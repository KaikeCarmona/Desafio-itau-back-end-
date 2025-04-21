package com.teste.itau.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import com.teste.itau.demo.Model.Transacao;

@Service
public class TransactionService {

    private final Queue<Transacao> localStorage = new ConcurrentLinkedQueue<>();

    public void add(Transacao newTransacao) {
        localStorage.add(newTransacao);
    }

    // public calculate() {
    // }

    // public delete() {
    // }
}
