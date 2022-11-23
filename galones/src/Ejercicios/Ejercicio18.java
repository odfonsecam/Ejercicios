/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lector = new Scanner(System.in);
        double salario;
        System.out.println("Ingrese su salario ");
        salario = lector.nextDouble();

        if (salario < 700000) {
            salario = salario + ((5 * salario) / 100);

        }
        if (salario >= 741000 && salario <= 999999) {
            salario = salario - ((salario / 100));

        }
        if (salario >= 1000000 && salario < 1800000) {
            salario = salario - ((8 * salario / 100));
        }
        if (salario > 1800000 && salario < 2500000) {
            salario = salario - ((11 * salario / 100));

        }
        if (salario > 2500000) {
            salario = salario - ((15 * salario / 100));
        }
        System.out.println("El salario total es: " + salario);
    }

}
