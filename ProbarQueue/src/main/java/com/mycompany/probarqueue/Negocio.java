/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.probarqueue;

import java.util.*;

/**
 *
 * @author a1162
 */
public class Negocio {
    private Queue<Orden> ordenes;
    private PriorityQueue<Tamal> tamales;
    
    public Negocio(){
        ordenes = new LinkedList<Orden>();
        tamales = new PriorityQueue<>();
    }
    public Tamal getTamal(){
        return tamales.poll();
    }
    public Orden getOrden(){
        if(ordenes.size()>0)
            return ordenes.poll();
        return null;
    }
    public int getNumeroDeOrdenes(){
        return ordenes.size();
    }
    public boolean registrarOrden(String cliente, int cantidadDeProducto){
        Orden orden = new Orden(cliente, cantidadDeProducto);
        if(vertificarOrden(orden)){
            ordenes.add(orden);
            return true;
        }
        return false;
    }
    public boolean vertificarOrden(Orden orden){
        int cantidad = 0;
        for(Orden o:ordenes){
            cantidad+=o.getCantidadDeProducto();
        }
        if(tamales.size()>= cantidad+orden.getCantidadDeProducto())
            return true;
        return false;
    }
    public int getCantidad(Orden orden){
        return orden.getCantidadDeProducto();
    }
    public void hacerTamal(int tamano, String sabor){
        tamales.add(new Tamal(tamano, sabor));
    }
}
