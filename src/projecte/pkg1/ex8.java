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
public class ex8 {
    public static void main(String[] args) {
    Scanner edad_u = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        var edad = edad_u.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad!");
        }
    }
}
