/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecte.pkg1;

import java.util.Scanner;

/**
 * Enunciado: Crea un programa que determine si un número introducido por el usuario es primo.
 * Un número primo es aquel que solo tiene dos divisores: 1 y el mismo número.
 * @author Val
 */
public class mini05 {
    public static void main(String[] args) {
        System.out.println("Introduce un número para verificar si es primo: ");    
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        
        if (num <= 1) {
            System.out.println("El número no es primo.");
        } else {
            boolean esPrimo = true;
            // Comenzamos desde 2 hasta la raíz cuadrada de num para optimizar
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(num + " es un número primo.");
            } else {
                System.out.println(num + " no es un número primo.");
            }
        }
    }
}
