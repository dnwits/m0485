/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecte.pkg1;

import java.util.Scanner;

/**
 *
 * @author ves8167
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner user_lado = new Scanner(System.in);
        System.out.println("Introduce el lado: ");
        int lados_u = user_lado.nextInt();
        var area = 
                lados_u * lados_u;
        System.out.println("El area es de: " + area);
        }
}
