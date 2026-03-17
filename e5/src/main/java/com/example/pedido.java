package com.example;

import java.util.ArrayList;
import java.util.List;

public class pedido{

private int numeroPedido;
private List<String> productos = new ArrayList<>();
private double total=0;

public void agregarProducto(String nombre,double precio){
productos.add(nombre);
total+=precio;}

public void eliminarProducto(String nombre)
{
if(productos.contains(nombre))
productos.remove(nombre);
}

public double getTotal(){
return total;
}

public void imprimirPedido(){
System.out.println("Pedido numero:"+numeroPedido);

for(String p:productos){
System.out.println("Producto:"+p);
}

System.out.println("Total:"+total);
}

}