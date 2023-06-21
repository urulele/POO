/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej05;

/**
 *
 * @author letic
 */
public class POOej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          CuentaBancaria cuenta1 = new CuentaBancaria();
          
          cuenta1.crearCuenta();
          cuenta1.ingresar(20000);
          cuenta1.retirar(15000);
          cuenta1.extraccionRapida();
          cuenta1.consultarSaldo();
          cuenta1.consultarDatos();
    
    
    }
    
  
    
}
