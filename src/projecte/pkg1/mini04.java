/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecte.pkg1;

import java.util.Scanner;

/**
 *
 *programa que calcule el precio final de un producto.
 *El programa debe leer el precio inicial del producto y aplicar un descuento 
 *según el siguiente criterio:
 *Si el precio es mayor a 100 euros, aplica un 10% de descuento.
 *Si el precio está entre 50 y 100 euros, aplica un 5% de descuento.
 *Si el precio es menor a 50 euros, no se aplica descuento.
 * @author Val
 */
public class mini04 {
    public static void main(String[] args) {
        double preu, desc;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indroduzca el precio del producto(€): ");
        preu = entrada.nextDouble();
        if (preu > 100){
            desc = (preu*10)/100;
            preu= preu - desc;
            System.out.println("Se le aplica un 10% de descuento ^^, a pagar: " + preu+ "€");
        } else if (50 <= preu && preu <= 100){
            desc = (preu*5)/100;
            preu= preu - desc;
            System.out.println("Se le aplica un 5% de descuento ^^, a pagar: " + preu+ "€");
        } else {
            System.out.println("No se aplican descuentos, a pagar: " + preu + "€");
        }
    }
}
