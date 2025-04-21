package com.teste.itau.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import com.teste.itau.demo.Model.Transacao;
import com.teste.itau.demo.Service.TransactionService;

import jakarta.validation.Valid;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/transacao")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @PostMapping
    public ResponseEntity<?> postTransaction(@Valid @RequestBody Transacao newTransacao) {

        if (newTransacao.getDataHora().isAfter(OffsetDateTime.now())) {
            return ResponseEntity.unprocessableEntity().build();
        }
        service.add(newTransacao);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    // @GetMapping("/transacao")
    // public calcTransactions() {
    // }

    // @DeleteMapping("/transacao")
    // public deleteHistoric() {
    // }

}
