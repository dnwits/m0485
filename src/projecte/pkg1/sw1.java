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
public class sw1 {
    public static void main(String[] args) {
        /*
        Programa que indique el dia de la semana 
        mediante la entrada del user
        Valores (1-7)
        */
        Scanner entrada = new Scanner(System.in);
        //leer el dia de la semana
        System.out.println("Indique que día de la semana es (valores permitidos del 1-7): ");
        int dia = entrada.nextInt();
        System.out.println("Has indicado que hoy es " + dia);
        //mostrar dia de la setmana
        switch (dia) {
            case 1 -> System.out.println("Hoy es lunes :T");
            case 2 -> System.out.println("Hoy es martes :/");
            case 3 -> System.out.println("Hoy es miércoles ._.");
            case 4 -> System.out.println("Hoy es jueves c:");
            case 5 -> System.out.println("Hoy es viernes :D");
            case 6 -> System.out.println("Hoy es sábado :3");
            case 7 -> System.out.println("Hoy es domingo ^^");
            default -> System.out.println("Número de día incorrecto...");
        }
    }
}
