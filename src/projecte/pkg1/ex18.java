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
        String nom;
        double h_trab, t_norm, s_bruto, s_neto, impuestos;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del trabajador: ");
        nom = scanner.nextLine();
        System.out.println("Introduce el número de horas trabajadas: ");
        h_trab = scanner.nextDouble();
        System.out.println("Introduce la tarifa normal por hora (€): ");
        t_norm = scanner.nextDouble();
        if (h_trab <= 35) {
            s_bruto = h_trab * t_norm;
            } else {
            s_bruto = 35 * t_norm;
            double h_extras = h_trab - 35;
            s_bruto += h_extras * t_norm * 1.5;
            }
        if (s_bruto <= 500) {
            impuestos = 0;
            } else if (s_bruto <= 900) {
            impuestos = (s_bruto - 500) * 0.25;
            } else {
            impuestos = 400 * 0.25;
            impuestos += (s_bruto - 900) * 0.45;
            }

        s_neto = s_bruto - impuestos;

        System.out.println("El salario NETO de " + nom + " asciende a: " + s_neto + "€. Impuestos: " + impuestos + "€.");
     }
}
