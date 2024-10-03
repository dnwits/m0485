/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecte.pkg1;

import java.util.Scanner;

/**
 *
 * @author Val
 * programa que lea un número entero y determine
 * si es par o impar. Además, si el número es
 * múltiplo de 5, debe mostrar un mensaje adicional
 * indicando que también es múltiplo de 5.
 */
public class mini02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el número para saber si es par o impar: ");
        int num = entrada.nextInt();
        if (num%2==0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        } if (num%5==0){
            System.out.println("Además es multiplo de 5 :D");
        }
    }
}
