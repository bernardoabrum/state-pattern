package org.example;

public class UsuarioSuspenso extends UsuarioEstado {

    private UsuarioSuspenso() {
    }

    private static UsuarioSuspenso instance = new UsuarioSuspenso();

    public static UsuarioSuspenso getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Suspenso";
    }

    public boolean ativar(Usuario usuario) {
        return true;
    }

    public boolean inativar(Usuario usuario) {
        return true;
    }
}
