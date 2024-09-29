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
    double nota;
    //String nota_txt;
    Scanner u_nota = new Scanner(System.in);
    System.out.println("Introduzca una nota: ");
    nota = u_nota.nextDouble();
        if (0 <= nota && nota < 3) {
            //nota_txt = "Muy deficiente...";
            System.out.println("Muy deficiente...");
        } else if (3 <= nota && nota < 5) {
            //nota_txt = "Insuficiente";
            System.out.println("Insuficiente");
        } else if (5 <= nota && nota < 6) {
            //nota_txt = "Bien";
            System.out.println("Bien");
        } else if (6 <= nota && nota < 9){
            //nota_txt = "Notable";
            System.out.println("Notable");
        } else if (9 <= nota && nota <= 10){
            //nota_txt = "Sobresaliente :3";
            System.out.println("Sobresaliente :3");
        } else {
            //nota_txt = "Nota introducida errónea";
            System.out.println("Nota introducida errónea");
        }  
            //System.out.println(nota_txt);
    }
}
