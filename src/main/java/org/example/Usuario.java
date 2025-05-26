package org.example;

public class Usuario {

    private UsuarioEstado estado;

    public Usuario() { this.estado = UsuarioAtivo.getInstance(); }

    public void setEstado(UsuarioEstado estado) {
        this.estado = estado;
    }

    public UsuarioEstado getEstado() { return estado; }

    public boolean ativar() {
        return estado.ativar(this);
    }

    public boolean inativar() { return estado.inativar(this);}

    public boolean suspender() { return estado.suspender(this);}

    public boolean banir() { return estado.banir(this); }

    public boolean pendente() {
        return estado.pendente(this);
    }
}
