package com.rutina_gym.usuarios;
import java.io.Serializable;


public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String cedula;
    private int edad;

    public Usuarios(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    // Getters y Setter
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida. Debe ser un valor positivo.");
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cédula: " + cedula + ", Edad: " + edad;
    }
}