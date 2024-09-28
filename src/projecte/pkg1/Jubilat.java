/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecte.pkg1;

import java.util.Scanner;

/**
 *
 * @author ves8167
 */
public class Jubilat {
    public static void main(String[] args) {
        int age;
        String sms;
        Scanner user_age = new Scanner(System.in);
        System.out.println("Introdueixi la seva edat: ");
        age = user_age.nextInt();
        if (age >= 0) {
            if (age >= 67) {
                sms = "Estás jubilat :D";
            } 
            else {
                sms = "No estás jubilat :T";
            }
        }
        else {
            sms = "La seva edat no és valida...";
        }
            System.out.println(sms);
    }
}
