package com.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private String fecha;
    private List<Producto> listaProductos = new ArrayList<>();


    public double calcularTotal() {
        double total = 0.00;
        for (int i = 0; i < listaProductos.size()-1; i++) {
            Producto producto = listaProductos.get(i);
            total = total + producto.getPrecio();
        }
        return total;
    }

    public void añadirProducto(Producto producto){
        listaProductos.add(producto);
    }
    public void eliminarProducto(Producto producto){
        listaProductos.remove(producto);
    }
}
