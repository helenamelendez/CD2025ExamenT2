package com.example;

import java.util.ArrayList;
import java.util.List;

public class gestorPedidos{

private List<pedido> pedidos=new ArrayList<>();

public void crearPedido(pedido p){
if(p!=null){
pedidos.add(p);
}
}

public int numeroPedidos(){
return pedidos.size();
}

public pedido buscarPedido(int indice){
if(indice>=0 && indice<pedidos.size())
return pedidos.get(indice);
else
return null;
}

public void imprimirPedidos(){
for(pedido p:pedidos){
p.imprimirPedido();
}
}

}