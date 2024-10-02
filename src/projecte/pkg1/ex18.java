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
public class ex18 {
     public static void main(String[] args) {
        /*Programa que pide el nombre, horas trabajadas y tarifa a la que cobra
        para mostrarle su sueldo neto y los impuestos
        SALARIO BRUTO: 
           Las primeras 35 horas se pagan a tarifa normal.
           Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
        SALARIO NETO:
           Los primeros 500 euros son libres de impuestos.
           Los siguientes 400 tienen un 25% de impuestos.
           Los restantes un 45% de impuestos.
        */ 
        String nom;
        //Le pedimos al usuario los datos y los leemos
        int hora_trab, tarifa_norm;
        double s_bruto, s_neto, impuestos;
        Scanner scanner = new Scanner(System.in); //PONER EL ESCANER SOLO UNA VEZ (AGAFA EL RESTO)
        System.out.println("Introduce el nombre del trabajador: ");
        nom = scanner.nextLine(); //PARA INTRODUCIR TEXTO **LINE**
        System.out.println("Introduce el número de horas trabajadas: ");
        hora_trab = scanner.nextInt();
        System.out.println("Introduce la tarifa normal por hora (€): ");
        tarifa_norm = scanner.nextInt();
         if (tarifa_norm <= 0) {
            System.out.println("El precio de las horas no puede ser 0 ni negativo...");
         }
         if (hora_trab <= 0){
             System.out.println("No puedes introducir ser 0 ni negativo en horas trabajadas...");
         }
        //Calcular salario bruto
        if (hora_trab <= 35) {
            s_bruto = hora_trab * tarifa_norm;
            } else {
                s_bruto = (35 * tarifa_norm) + ((hora_trab - 35)* tarifa_norm * 1.5);
        //Calcular IMPUESTOS
            }
        if (s_bruto <= 500) {
            impuestos = 0;
            } else if (s_bruto <= 900) {
            impuestos = (s_bruto - 500) * 0.25;
            } else {
            impuestos = ((s_bruto - 900) * 0.45) + (400 * 0.25);
            }

        s_neto = s_bruto - impuestos;
         System.out.println("El salario BRUTO de " + nom + " asciende a: " + s_bruto);
        System.out.println("El salario NETO de " + nom + " asciende a: " + s_neto + "€. Impuestos: " + impuestos + "€.");
     }
}
