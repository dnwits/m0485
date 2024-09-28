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
public class ex4 {
    public static void main(String[] args) {
        Scanner valor1 = new Scanner(System.in);
        System.out.println("Introduzca X: ");
        int x = valor1.nextInt();
        Scanner valor2 = new Scanner(System.in);
        System.out.println("Introduzca Y: ");
        int y = valor2.nextInt();
        int suma, resta, mult, div;
        
        suma = x + y;
        resta = x - y;
        mult = x * y;
        div = x / y;
                
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + mult);
        System.out.println("División: " + div);
    }
}
