/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.probarqueue;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author a1162
 */
public final class ProbarQueue {
    private PriorityQueue<Tamal> tamales;
    public static void main(String[] args) {
        ProbarQueue probar = new ProbarQueue();
    }
    private Negocio negocio;
    public ProbarQueue() {
        negocio = new Negocio();
        int opcion = menu();
        while(opcion!=4){
            switch (opcion) {
                case 1:
                    registrarOrden();
                    break;
                case 2:
                    hacerTamal();
                    break;
                case 3:
                    if(entregarOrden())
                        System.out.println("Exito!");
                    else
                        System.out.println("Fallar...");
                    break;
                default:
                    throw new AssertionError();
            }
            opcion=menu();
        }
        System.out.println("Adios!!");
    }
    public int menu(){
        System.out.println("Menu:\n1. Registrar orden\n2. Hacer tamal\n3. Entregar orden\n4. Salir");
        System.out.print("Opcion: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public boolean entregarOrden(){
        Orden orden = negocio.getOrden();
        if(orden!=null){
            System.out.println(orden.toString());
            for(int i = 0; i< orden.getCantidadDeProducto();i++){
                System.out.println((i+1)+". "+negocio.getTamal().toString());
            }
            return true;
        }
        return false;
    }
    public void registrarOrden(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el nombre de cliente");
        String nombre = scan.nextLine();
        System.out.println("Introduce su cantidad de comprar: ");
        int cantidad = scan.nextInt();
        if(negocio.registrarOrden(nombre, cantidad))
                System.out.println("Orden valido");
        else
            System.out.println("Orden invalido");
    }
    public void hacerTamal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el tamano del tamal: ");
        int tamano = scan.nextInt();
        System.out.println("Introduce su sabor: ");
        String sabor = scan.next();
        negocio.hacerTamal(tamano, sabor);
    }
}
