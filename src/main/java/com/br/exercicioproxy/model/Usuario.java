package com.br.exercicioproxy.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tetzner
 */
public class Usuario {

    private final String nome;
    private final String senha;
    private final List<String> operacoesPermitidas;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.operacoesPermitidas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public List<String> getOperacoes() {
        return Collections.unmodifiableList(operacoesPermitidas);
    }

    public void adicionarOperacaoPermitida(String operacao) {
        operacoesPermitidas.add(operacao);
    }

}
