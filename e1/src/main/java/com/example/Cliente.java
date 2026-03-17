package com.example;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nombre;
    private String email;
    private List<Pedido> listaPedidos = new ArrayList<>();


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
        System.out.println(getNombre() + " " + getEmail());
    }

    public void realizarPedido(Pedido pedido){
        listaPedidos.add(pedido);
    }

    public void cancelarPedido(Pedido pedido){
        listaPedidos.remove(pedido);
    }

}
