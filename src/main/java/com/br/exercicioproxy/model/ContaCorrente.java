package com.br.exercicioproxy.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tetzner
 */
class ContaCorrente implements IContaCorrente {

    private double saldo;
    private final List<String> transacoes;

    ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
        this.transacoes = new ArrayList<>();
        transacoes.add("Abertura de conta com saldo: " + saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            transacoes.add("Saque: -" + valor);
        } else {
            transacoes.add("Tentativa de saque insuficiente: -" + valor + ", valor maior que saldo");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            transacoes.add("Depósito: +" + valor);
        } else {
            transacoes.add("Tentativa de depósito inválido: " + valor + ", valor menor que zero");
        }
    }

    @Override
    public List<String> emitirExtrato() {
        return new ArrayList<>(transacoes);
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void adicionarTransacao(String nomeTransacao) {
        transacoes.add(nomeTransacao);
    }

}
