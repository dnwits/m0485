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
public class ex16 {
    public static void main(String[] args) {
    /**
     * Programa que dona un anota (0-10)
     * de 0 a 3 muy deficiente
     * de 3 a 5 insuficiente
     * de 5 a 6 bien
     * de 6 a 9 notable
     * de 9 a 10 excelent
    */
    //Declarem les variables
    double nota;
    Scanner u_nota = new Scanner(System.in);
    //Demanem a l'usuari la nota i la guardem
    System.out.println("Introduzca una nota: ");
    nota = u_nota.nextDouble();
    //Comprobar la nota introduida i determinar la nota a mostrar
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
        } else {
            //Mensaje de error si nota fuera del rango de 0-10
            System.out.println("Nota introducida errónea...");
        }  
    }
}
