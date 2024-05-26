package com.rutina_gym.usuarios;

import java.util.ArrayList;
import java.util.List;


public class GestorUsuarios {
        private List<Usuarios> usuarios;

        public GestorUsuarios() {
            this.usuarios = new ArrayList<Usuarios>();
        }
        public void agregarUsuario(Usuarios usuario) {
            usuarios.add(usuario);
        }
        public List<Usuarios> obtenerUsuarios() {
            return usuarios;
        }
}

