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
    //programa que pida la hora, minutos y segundos
    //que muestra el tiempo tras un segundo
    int hora, min, sec;
    //declarar las variables y pedir al usuario los datos
    Scanner hora_u = new Scanner(System.in);
    System.out.println("Introduzca la hora: ");
    hora = hora_u.nextInt();
    Scanner min_u = new Scanner(System.in);
    System.out.println("Introduzca los minutos: ");
    min = min_u.nextInt();
    Scanner sec_u = new Scanner(System.in);
    System.out.println("Introduzca los segundos: ");
    sec = sec_u.nextInt();
    //Mostrar al usuario la hora actual
    System.out.println("Hola actual: " + hora + ":" + min + ":" + sec);
    //Añadimos 1 segundo a la hora y hacemos los condicionales
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
    System.out.println("Hora 1 segundo después: " + hora + ":" + min + ":" + sec);
    }
}
