/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej05;

import java.util.Scanner;

/**
 *
 * @author letic
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private long numeroDNI;
    private int saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long numeroDNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.numeroDNI = numeroDNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getNumeroDNI() {
        return numeroDNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNumeroDNI(long numeroDNI) {
        this.numeroDNI = numeroDNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void crearCuenta(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su numero de cuenta");
        numeroCuenta = leer.nextInt();
        
        System.out.println("Ingrese su DNI");
        numeroDNI = leer.nextLong();
        
        System.out.println("Ingrese el saldo de su cuenta");
        saldoActual = leer.nextInt();
    }
    
    // consultar lo de la letra que dice ingresar(double ingreso)
    public void ingresar (int ingreso){
        saldoActual = saldoActual + ingreso;
        System.out.println("Su saldo final es: " + saldoActual );
    }
    
   public void retirar (int retiro){
       saldoActual = saldoActual - retiro;
       if (saldoActual > 0){
           System.out.println("El saldo actual es: "+ saldoActual);
       } else {
           saldoActual = 0;
           System.out.println("El saldo actual es: "+ saldoActual);
       }
      
   } 
   
   public void extraccionRapida(){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el monto que desea retirar");
       int monto = leer.nextInt();
       double porcentaje = monto*100/saldoActual;
       
       if (porcentaje < 20){
           saldoActual = saldoActual - monto;
           System.out.println("Extraccion exitosa. El saldo actual es: " + saldoActual);
       } else {
           System.out.println("El monto supera el 20%. No es posible realizar la transaccion");
       }
       
   }
    public void consultarSaldo(){
        System.out.println("El saldo disponible es: " + saldoActual);
    }
    
    public void consultarDatos(){
        System.out.println("El numero de cuenta es: " + numeroCuenta);
        System.out.println("El DNI del usuario es: "+ numeroDNI);
        System.out.println("El saldo actual de la cuenta es: "+ saldoActual);
    }
    
}
