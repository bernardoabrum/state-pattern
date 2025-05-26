package org.example;

public class UsuarioPendente extends UsuarioEstado {

    private UsuarioPendente() {
    }

    private static UsuarioPendente instance = new UsuarioPendente();

    public static UsuarioPendente getInstance() {
        return instance;
    }

    public String getEstado() { return "Pendente"; }

    public boolean ativar(Usuario usuario) { return true; }

    public boolean pendente(Usuario usuario) { return true; }
}
