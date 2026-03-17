package com.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private String fecha;


    public double calcularTotal() {
        double total = 0.00;
        for (int i = 0; i < productos.size()-1; i++) {
            total = total + productos[i].precio;
        }
        return total;
    }

    public void añadirProducto(Producto producto){
        productos.add(producto);
    }
    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }
}
