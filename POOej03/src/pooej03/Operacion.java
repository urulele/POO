/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej03;

import java.util.Scanner;

/**
 *
 * @author letic
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese numero 1");
        numero1= leer.nextInt();
        
        System.out.println("Igrese numero 2");
        numero2= leer.nextInt();
                
               
    }
    
    public int sumar(){
        int suma;
        suma = numero1 + numero2;
        System.out.println("El resultado de la suma es: "+ suma);
        return suma;
        
    }
    
    public int resta(){
        int resta;
        resta = numero1 - numero2;
        System.out.println("El resultado de la resta es: "+ resta);
        return resta;
    }
    
    public int multiplicar(){
        int multiplicacion;
        multiplicacion = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es: "+ multiplicacion);
        return multiplicacion ;
    }
    
    public float dividir(){
        if (numero2 == 0){
            System.out.println("No es posible dividir entre 0");
            return 0;
        } else {
            float division;
            division = numero1 / numero2;
            System.out.println("El resultado de la division es: "+ division);
            return division;
            
            //La division da mal porque al poner / para dividir me da el resultado truncado,
            //para cambiar esto num1 y num2 deberian ser redefinidos como double en vez de int
        }
        
    }
}
