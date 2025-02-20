package com.br.exercicioproxy.singleton;

import com.br.exercicioproxy.model.Usuario;

/**
 *
 * @author tetzner
 */
public class UsuarioLogadoSingleton {
    public static UsuarioLogadoSingleton instancia = null;
    private Usuario usuario;
    
    private UsuarioLogadoSingleton(){
        this.usuario = null;
    }
    
    public static UsuarioLogadoSingleton getInstancia(){
        if(instancia == null){
            instancia = new UsuarioLogadoSingleton();
        }
        return instancia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public boolean usuarioLogado(){
        return usuario != null;
    }
    
    public void logout(){
        this.usuario = null;
    }
       
}
