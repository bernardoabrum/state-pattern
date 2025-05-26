package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    Usuario usuario;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario();
    }

    @Test
    public void deveInativarUsuarioAtivo() {
        assertEquals(UsuarioAtivo.getInstance(), usuario.getEstado());
        usuario.setEstado(UsuarioInativo.getInstance());
        assertEquals(UsuarioInativo.getInstance(), usuario.getEstado());
    }
}
