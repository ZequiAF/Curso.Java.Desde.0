package com.s2daw.demo.controllers;

import com.s2daw.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario=new Usuario();
        usuario.setId(id);
        usuario.setNombre("Ezequiel");
        usuario.setApellido("Arean");
        usuario.setEmail("ezequielmatias.af@gmail.com");
        usuario.setTelefono("722126018");
        return usuario;
    }
    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios=new ArrayList<>();
        Usuario usuario=new Usuario();
        usuario.setId(123L);
        usuario.setNombre("Ezequiel");
        usuario.setApellido("Matías");
        usuario.setEmail("ezequielmatias.af@@gmail.com");
        usuario.setTelefono("722126018");
        usuarios.add(usuario);

        usuario=new Usuario();
        usuario.setId(268L);
        usuario.setNombre("Oscar");
        usuario.setApellido("Arean");
        usuario.setEmail("oscar.a@gmail.com");
        usuario.setTelefono("45965238");
        usuarios.add(usuario);

        usuario=new Usuario();
        usuario.setId(3L);
        usuario.setNombre("Sebast");
        usuario.setApellido("Fernández");
        usuario.setEmail("sebast.f@gmail.com");
        usuario.setTelefono("456921238");
        usuarios.add(usuario);

        return usuarios;
    }
}
