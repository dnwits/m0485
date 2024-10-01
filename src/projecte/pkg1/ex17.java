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
    int hora, min, sec;
    Scanner hora_u = new Scanner(System.in);
    System.out.println("Introduzca la hora: ");
    hora = hora_u.nextInt();
    Scanner min_u = new Scanner(System.in);
    System.out.println("Introduzca los minutos: ");
    min = min_u.nextInt();
    Scanner sec_u = new Scanner(System.in);
    System.out.println("Introduzca los segundos: ");
    sec = sec_u.nextInt();
        if (sec == 59){
            sec = 00;
            if (min == 59){
                min = 00;
                if (hora ==23){
                    hora = 00;
                } else {
                    hora++;
                }
            } else {
                min++;
            }
        } else {
            sec++;
        }
    System.out.println("Hola 1 segons després: " + hora + ":" + min + ":" + sec);
    }
}
