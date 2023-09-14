/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.probarqueue;

/**
 *
 * @author a1162
 */
public class Orden {
    private String cliente;
    private int cantidadDeProducto;

    public Orden(String cliente, int cantidadDeProducto) {
        this.cliente = cliente;
        this.cantidadDeProducto = cantidadDeProducto;
    }
    public String toString(){
        return "Nombre de cliente: "+cliente+"\nCantidad de comprar: "+cantidadDeProducto;
    }
    public String getCliente() {
        return cliente;
    }

    public int getCantidadDeProducto() {
        return cantidadDeProducto;
    }
    
}
