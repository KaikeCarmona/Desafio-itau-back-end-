package com.teste.itau.demo.Model;

import java.time.OffsetDateTime;

import org.springframework.stereotype.Component;

@Component
public class Transacao {

    private Double valor;

    private OffsetDateTime dataHora;

    public Transacao() {
    }

    public Transacao(OffsetDateTime dataHora, Double valor) {
        this.dataHora = dataHora;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

}
