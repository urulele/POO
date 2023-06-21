/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej06;

import java.util.Scanner;

/**
 *
 * @author letic
 */
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
        System.out.println("La cafetera esta llena. Cantidad de cafe; "+cantidadActual);
    }
    
    public void servirTaza(int taza){
        int diferencia = cantidadActual - taza;
        
        if (diferencia >= 0){
            System.out.println("Taza llena.");
        } else {
            int tazaHasta = taza + diferencia;
            System.out.println("La taza se lleno parcialmente, su contenido es de: " + tazaHasta);
        }
    }
    
    public void vaciarCafetera(){
        cantidadActual = 0;
        System.out.println("La cafetera esta vacia. COntenido: "+ cantidadActual);
    }
    
    public void agregarCafe (int cafe){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cafe que desea agregar:");
        cafe = leer.nextInt();
        
        cantidadActual = cantidadActual + cafe;
        System.out.println("La cantidad de cafe actual en la cafetera es: " + cantidadActual);
        
    }
}
