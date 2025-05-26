package org.example;

public class UsuarioAtivo extends UsuarioEstado {

    private UsuarioAtivo() {
    }

    private static UsuarioAtivo instance = new UsuarioAtivo();

    public static UsuarioAtivo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ativo";
    }

    public boolean banir(Usuario usuario) {
        return true;
    }

    public boolean inativar(Usuario usuario) {
        return true;
    }

    public boolean suspender(Usuario usuario) {
        return true;
    }
}
