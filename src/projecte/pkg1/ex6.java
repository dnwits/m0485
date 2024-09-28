/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecte.pkg1;

import java.util.Scanner;

/**
 *
 * @author Val
 */
public class ex6 {
    public static void main(String[] args) {
    Scanner preu_u = new Scanner(System.in);
        System.out.println("Introduzca el precio del artículo: ");
        double preu_art = preu_u.nextDouble();
        
    Scanner preu_v = new Scanner(System.in);
        System.out.println("Introduzca el precio de venta: ");
        double preu_vent = preu_v.nextDouble();
        
    double desc = ((preu_art - preu_vent)* 100) / preu_art;
    System.out.println("El descuento es de: " + desc);
    }
}
