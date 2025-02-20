package com.br.exercicioproxy.principal;

import com.br.exercicioproxy.model.ContaCorrenteProxy;
import com.br.exercicioproxy.model.Usuario;
import com.br.exercicioproxy.singleton.UsuarioLogadoSingleton;

/**
 *
 * @author tetzner
 */
public class Principal {

    public static void main(String[] args) {
        Usuario usuarioLogado = new Usuario("carlos", "senha456");
        usuarioLogado.adicionarOperacaoPermitida("sacar");
        usuarioLogado.adicionarOperacaoPermitida("depositar");
        usuarioLogado.adicionarOperacaoPermitida("emitirExtrato");

        UsuarioLogadoSingleton.getInstancia().setUsuario(usuarioLogado);
        ContaCorrenteProxy proxy = new ContaCorrenteProxy(1500.00);
        
        proxy.depositar(1500.00);
        System.out.println(proxy.getSaldo());
        
        proxy.sacar(500.00);
        System.out.println(proxy.getSaldo());
        
        System.out.println(proxy.emitirExtrato());

    }
}
