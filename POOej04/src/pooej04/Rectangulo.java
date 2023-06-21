/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej04;

import java.util.Scanner;

/**
 *
 * @author letic
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese la base del rectangulo");
        Scanner leer = new Scanner(System.in);
        base = leer.nextDouble();

        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextDouble();

    }

    public double area() {
        double area;
        area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
        return area;
    }

    public double perimetro() {
        double perimetro;
        perimetro = 2 * base + 2 * altura;
        System.out.println("El perimetro el rectangulo es: " + perimetro);
        return perimetro;
    }

    public void dibujar() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
