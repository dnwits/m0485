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
public class ex14 {
    public static void main(String[] args) {
    int a, b;
    Scanner v_a = new Scanner(System.in);
    System.out.println("Introduzca el primer número: ");
    a = v_a.nextInt();
    Scanner v_b = new Scanner(System.in);
    System.out.println("Introduzca el segundo número: ");
    b = v_b.nextInt();
        if (a > b){
            System.out.println(a);
            if (a==b){
                System.out.println("Son iguales! :3");
            } else {
                System.out.println(b);
            }
        }
    }
}
