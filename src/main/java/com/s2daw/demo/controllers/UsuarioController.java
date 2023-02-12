package com.s2daw.demo.controllers;

import com.s2daw.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Ezequiel");
        usuario.setApellido("Arean");
        usuario.setEmail("ezequielmatias.af@gmail.com");
        usuario.setTelefono("722126018");
        usuario.setPassword("ArgentinaCampeona");

        return usuario;
    }
    @RequestMapping(value="usuario848")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Ezequiel");
        usuario.setApellido("Arean");
        usuario.setEmail("ezequielmatias.af@gmail.com");
        usuario.setTelefono("722126018");
        usuario.setPassword("ArgentinaCampeona");

        return usuario;
    }
    @RequestMapping(value="usuario7554")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Ezequiel");
        usuario.setApellido("Arean");
        usuario.setEmail("ezequielmatias.af@gmail.com");
        usuario.setTelefono("722126018");
        usuario.setPassword("ArgentinaCampeona");

        return usuario;
    }
    @RequestMapping(value="usuario7848")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Ezequiel");
        usuario.setApellido("Arean");
        usuario.setEmail("ezequielmatias.af@gmail.com");
        usuario.setTelefono("722126018");
        usuario.setPassword("ArgentinaCampeona");

        return usuario;
    }
}
