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
public class ex12 {
    public static void main(String[] args) {
    int a;
    Scanner v_a = new Scanner(System.in);
    System.out.println("Introduzca un número: ");
    a = v_a.nextInt();
        if (a >= 0){
            System.out.println("Número positivo ^^");
        } else {
            System.out.println("Número negativo :3");
        }
    }
}
