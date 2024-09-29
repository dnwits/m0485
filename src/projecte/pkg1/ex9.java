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
public class ex9 {
    public static void main(String[] args) {
    String sms = null;
    int edad;
    Scanner edad_u = new Scanner(System.in);
    System.out.println("Introduzca su edad: ");
    edad = edad_u.nextInt();
        if (edad >= 0) {
            if (edad >= 18) {
                sms = "eres mayor de edad.";
            }
            else {
                sms = "eres menor de edad.";
            }
        }
    System.out.println(sms);
    }
}
