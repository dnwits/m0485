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
public class ex17 {
    public static void main(String[] args) {
    int hora;
    Scanner hora_u = new Scanner(System.in);
    System.out.println("Introduzca la hora: ");
    hora = hora_u.nextInt();
    int min;
    Scanner min_u = new Scanner(System.in);
    System.out.println("Introduzca los minutos: ");
    min = min_u.nextInt();
    int sec;
    Scanner sec_u = new Scanner(System.in);
    System.out.println("Introduzca los segundos: ");
    sec = sec_u.nextInt();
        if (sec == 59){
            sec++;
        //else if (min == 59){
            
        //}
        }
    
    }
}
