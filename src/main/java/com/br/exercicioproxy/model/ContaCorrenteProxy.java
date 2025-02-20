package com.br.exercicioproxy.model;

import java.util.List;

import com.br.exercicioproxy.singleton.GerenciadorDeAutorizacao;

/**
 *
 * @author tetzner
 */
public class ContaCorrenteProxy implements IContaCorrente {

    private final ContaCorrente real;

    public ContaCorrenteProxy(double saldoInicial) {
        real = new ContaCorrente(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (GerenciadorDeAutorizacao.getInstancia().autorizaOperacao("sacar")) {
            real.sacar(valor);
        } else {
            throw new RuntimeException("Usuário não tem autorização para sacar.");
        }
    }

    @Override
    public void depositar(double valor) {
        if (GerenciadorDeAutorizacao.getInstancia().autorizaOperacao("depositar")) {
            real.depositar(valor);
        } else {
            throw new RuntimeException("Usuário não tem autorização para depositar.");
        }
    }

    @Override
    public List<String> emitirExtrato() {
        if (GerenciadorDeAutorizacao.getInstancia().autorizaOperacao("emitirExtrato")) {
            return real.emitirExtrato();
        } else {
            throw new RuntimeException("Usuário não tem autorização para emitir extrato.");
        }
    }

    @Override
    public double getSaldo() {
        return real.getSaldo();
    }

}
