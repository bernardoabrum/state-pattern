package org.example;

public class UsuarioInativo extends UsuarioEstado {

    private UsuarioInativo() {
    }

    private static UsuarioInativo instance = new UsuarioInativo();

    public static UsuarioInativo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Inativo";
    }

    public boolean ativar(Usuario usuario) {
        return true;
    }
}
