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
public class ex10 {
    public static void main(String[] args) {
    int a, b;
    int suma, resta, mult, div;
    Scanner v_a = new Scanner(System.in);
    System.out.println("Introduzca un número A: ");
    a = v_a.nextInt();
    Scanner v_b = new Scanner(System.in);
    System.out.println("Introduzca otro número B: ");
    b = v_b.nextInt();
        suma = a + b;
        resta = a - b;
        mult = a * b;
        System.out.println("A+B= " + suma + " A-B= " + resta + " A*B= " + mult);
        if (0 == b){
            System.out.println("A/B error de división...");
        } else {
            div = a/b;
            System.out.println("A/B= " + div);
        }
    }
}
