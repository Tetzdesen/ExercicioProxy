package com.br.exercicioproxy.model;

import java.util.List;

/**
 *
 * @author tetzner
 */
public interface IContaCorrente {
    void sacar(double valor);
    void depositar(double valor);
    List<String> emitirExtrato();
    double getSaldo();
}
