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
public class ex15 {
    public static void main(String[] args) {
    int a, b, c;
    Scanner v_a = new Scanner(System.in);
    System.out.println("Introduzca el primer número: ");
    a = v_a.nextInt();
    Scanner v_b = new Scanner(System.in);
    System.out.println("Introduzca el segundo número: ");
    b = v_b.nextInt();
    Scanner v_c = new Scanner(System.in);
    System.out.println("Introduzca el tercer número: ");
    c = v_c.nextInt();
        if (a > b){
            if (a < c){
                System.out.println("El mayor es: "+a);
            } else {
                System.out.println("El mayor es: "+c);
            }
            } if (b > c){
                System.out.println("El mayor es: "+b);
            } else {
                System.out.println("El mayor es: "+c);
            }
    }
}
