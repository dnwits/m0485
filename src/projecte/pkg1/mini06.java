/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecte.pkg1;

import java.util.Scanner;

/**
 * Crea un programa que lea un número positivo N y calcule su factorial (N!).
 * Si el número es negativo, debe mostrar un mensaje de error.)
 * @author Val
 */
public class mini06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número positivo para calcular su factorial: ");
        int numero = entrada.nextInt();
        
        if (numero < 0) {
            System.out.println("Error: El número no puede ser negativo.");
        } else {
            long factorial = 1; // Usamos 'long' por si el número es grande
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}
