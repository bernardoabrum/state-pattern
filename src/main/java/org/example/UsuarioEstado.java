package org.example;

public abstract class UsuarioEstado {

    public abstract String getEstado();

    public boolean ativar(Usuario usuario) {
        return false;
    }

    public boolean inativar(Usuario usuario) {
        return false;
    }

    public boolean suspender(Usuario usuario) {
        return false;
    }

    public boolean banir(Usuario usuario) {
        return false;
    }

    public boolean pendente(Usuario usuario) { return false; }
}
