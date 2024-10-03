/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecte.pkg1;

import java.util.Scanner;

/**
 *
 * @author Val
 * programa que lea tres números enteros y determine 
 * cuál es el mayor y cuál es el menor.
 * Si los tres números son iguales, debe indicarlo
 */
public class mini01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //leer las variables
        //pedir los datos
        System.out.println("Usted va a comparar tres numeros. Introduzca el valor A: ");
        int a = entrada.nextInt();
        System.out.println("Introduzca el valor B: ");
        int b = entrada.nextInt();
        System.out.println("Introduzca el valor C: ");
        int c = entrada.nextInt();
        //realizar las comparaciones
        if (a >= b && a >= c) {
            System.out.println("El mayor es: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es: " + b);
        } else {
            System.out.println("El mayor es: " + c);
        }
         // Comparar si hay dos números iguales
        if (a == b || a == c || b == c) {
                System.out.println("Algunos de los números son iguales :3");
        } else {
            System.out.println("Todos los números son diferentes, nice!");
        }    
    }
}
