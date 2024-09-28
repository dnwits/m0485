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
public class ex7 {
    public static void main(String[] args) {
    Scanner millas_u = new Scanner(System.in);
        System.out.println("Introduzca una distancia en millas marinas: ");
        double millas = millas_u.nextDouble();
    double m = millas * 1852;
    System.out.println("La distacia introducida en millas equivale a: " + m + "metros.");
    }
}
