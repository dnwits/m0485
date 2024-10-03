/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecte.pkg1;

import java.util.Scanner;

/**
 *programa que lea cinco calificaciones de un estudiante
 * (valores entre 0 y 10) y calcule la media. 
 * Después, muestra la calificación alfabética 
 * usando la siguiente escala:
 *0 a <3: Muy Deficiente 
 * 3 a <5: Insuficiente
 *5 a <6: Bien
 *6 a <9: Notable
 *9 a 10: Sobresaliente
 * @author Val
 */
public class mini03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int v1, v2, v3, v4, v5;
        System.out.println("Introduzca la primera nota del estudiante (valores de 0-10): ");
        v1 = entrada.nextInt();
        if (v1 < 0 || v1 > 10) {
            System.out.println("Error: Nota fuera de rango.");
            return;
        }
        System.out.println("Introduzca la segunda nota del estudiante (valores de 0-10): ");
        v2 = entrada.nextInt();
        if (v2 < 0 || v2 > 10) {
            System.out.println("Error: Nota fuera de rango.");
            return;
        }
        System.out.println("Introduzca la tercera nota del estudiante (valores de 0-10): ");
        v3 = entrada.nextInt();
        if (v3 < 0 || v3 > 10) {
            System.out.println("Error: Nota fuera de rango.");
            return;
        }
        System.out.println("Introduzca la cuarta nota del estudiante (valores de 0-10): ");
        v4 = entrada.nextInt();
        if (v4 < 0 || v4 > 10) {
            System.out.println("Error: Nota fuera de rango.");
            return;
        }
        System.out.println("Introduzca la quinta nota del estudiante (valores de 0-10): ");
         v5 = entrada.nextInt();
        if (v5 < 0 || v5 > 10) {
            System.out.println("Error: Nota fuera de rango.");
            return;
        }
        int nota;
        nota = (v1 + v2 + v3 + v4 + v5)/5;
            System.out.println("Nota media de: " + nota);
        if (0 <= nota && nota < 3) {
            System.out.println("Muy deficiente...");
        } else if (3 <= nota && nota < 5) {
            System.out.println("Insuficiente");
        } else if (5 <= nota && nota < 6) {
            System.out.println("Bien");
        } else if (6 <= nota && nota < 9){
            System.out.println("Notable");
        } else if (9 <= nota && nota <= 10){
            System.out.println("Sobresaliente :3");
        }  
    }
}
