package com.s2daw.demo.dao;

import com.s2daw.demo.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    Usuario getUsuario(Long id);
    
    List<Usuario> getUsuarios();

    void eliminarUsuario(Long id);

    void registrarUsuario(Usuario usuario);

    void registraUsuario(Usuario usuario);

    boolean verificarCredenciales(Usuario usuario);

    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
