/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecte.pkg1;

import java.util.Scanner;

/**
 *
 * @author ves8167
 */
public class ex5 {
    public static void main(String[] args) {
    Scanner valor1 = new Scanner(System.in);
        System.out.println("Introduzca X: ");
        int x = valor1.nextInt();
        double pi = 3.1416;
        double longi, area, volum;
        longi = 2 * x * pi;
        area = pi * (x^2);
        volum = (4.0/3.0) * pi * x * x * x;
        System.out.println("La longitud de la circunferencia es de: " + longi);
        System.out.println("El area del circulo es de: " + area);
        System.out.println("El volum de la esfera es de: " + volum);
    }    
}
