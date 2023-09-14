/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.probarqueue;

/**
 *
 * @author a1162
 */
public class Tamal implements Comparable{
    private int tamano;
    private String sabor;

    public Tamal(int tamano, String sabor) {
        this.tamano = tamano;
        this.sabor = sabor;
    }
    
    public String toString(){
        return "Tamano: "+tamano+"  Sabor: "+sabor;
    }
    
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public int compareTo(Object o) {
        Tamal otro = (Tamal) o;
        return this.tamano-otro.tamano;
    }
    
}
