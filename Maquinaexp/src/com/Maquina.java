package com;

import java.util.HashMap;

public class Maquina {
  
  private HashMap <String, Producto> loc;

  public Maquina(HashMap<String, Producto> loc) {
    this.loc = loc;
  }
  
  public Producto buscarProductos (String ubi) {
    Producto productos = null;
    
    for (String key:this.loc.keySet()) {
      
      
      if(key.equals(ubi)) {
        productos = this.loc.get(key);
        break;
      }
  
    }
    
    return productos;
  }
  
  
  
  public Maquina despachar (String ubi, double dinero) {
    
    Maquina producto = null;
    
    if (this.buscarProductos(ubi)!=null) {
      
      Producto loc = this.buscarProductos(ubi);
      
      if (dinero<loc.getPrecio()) {
        System.out.println("Dinero insuficiente");
        return producto;
      }else if (dinero==loc.getPrecio()) {
        System.out.println("Producto liberado");
        return producto;
      }else if (dinero > loc.getPrecio()) {
        System.out.println("Producto liberado");
        System.out.println("Cambio de " + (dinero - loc.getPrecio()));
        return producto;
     
      }
              
      
  } else {
    System.out.println("no se encontro producto");
  }
    return producto;
    
    
  }
  

}
