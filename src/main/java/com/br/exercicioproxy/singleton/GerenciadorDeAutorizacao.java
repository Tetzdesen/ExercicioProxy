package com.br.exercicioproxy.singleton;

import com.br.exercicioproxy.model.Usuario;

/**
 *
 * @author tetzner
 */
public class GerenciadorDeAutorizacao {

    private static GerenciadorDeAutorizacao instancia = null;
    private final Usuario usuarioLogado;

    private GerenciadorDeAutorizacao() {
        usuarioLogado = UsuarioLogadoSingleton.getInstancia().getUsuario();
    }

    public static GerenciadorDeAutorizacao getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorDeAutorizacao();
        }
        return instancia;
    }

    public boolean autorizaOperacao(String nome) {
        return usuarioLogado.getOperacoes().contains(nome);
    }

}
