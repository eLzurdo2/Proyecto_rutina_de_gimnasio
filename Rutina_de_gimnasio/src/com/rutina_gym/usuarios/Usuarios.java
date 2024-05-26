package com.rutina_gym.usuarios;

public class Usuarios {


            private String nombre;
            private String IdUsuario;

            public Usuarios (String nombre, String IdUsuario) {
                this.nombre = nombre;
                this.IdUsuario = IdUsuario;
            }

            public String getNombre() {
                return nombre;
            }

            public String getIdUsuario() {
                return IdUsuario;
            }
}

