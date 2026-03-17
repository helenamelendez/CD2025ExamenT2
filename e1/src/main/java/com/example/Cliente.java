package com.example;
import java.util.ArrayList;

public class Cliente {
    
    private String nombre;
    private String email;


    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Cliente(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }




    public void mostrarInfo(){

    }

    public void realizarPedido(Pedido pedido){
        
    }

}
