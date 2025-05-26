package org.example;

public class UsuarioBanido extends UsuarioEstado {

    private UsuarioBanido() {
    }

    private static UsuarioBanido instance = new UsuarioBanido();

    public static UsuarioBanido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Banido";
    }
}
