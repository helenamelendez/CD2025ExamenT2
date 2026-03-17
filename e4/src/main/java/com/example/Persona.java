package com.example;

/**
 * Clase Persona
 * @author Helena
 */
public class Persona {

    private String nombre;
    private int edad;


    /**
     * Constructor de la clase persona
     * @param nombre | Nombre de la persona
     * @param edad | Edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Getter del atributo nombre
     * @return  devuleve el nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * setter del atributo nombre
     * @param nombre asigna a nombre el parametro recibido
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getter del atributo edad
     * @return  devuleve la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * setter del atributo edad
     * @param edad asigna a edad el parametro recibido
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
