package com.br.exercicioproxy.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tetzner
 */
public class Usuario {

    private final String nome;
    private final String senha;
    private final List<String> operacoes;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.operacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public List<String> getOperacoes() {
        return operacoes;
    }

    public void adicionarOperacao(String operacao) {
        operacoes.add(operacao);
    }

}
