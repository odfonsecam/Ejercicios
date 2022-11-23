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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double cantHoras;
        double precioHora;
        double pago = 0;
        double ganaSemanal;
        double ganaMensual;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas trabajadas por semana");
        cantHoras = lector.nextDouble();
        if (cantHoras <= 56 && cantHoras >= 38) {
            System.out.println("Ingrese el precio por hora");
            precioHora = lector.nextDouble();

            System.out.println("la cantidad de horas trabajadas fue: " + cantHoras);
            ganaSemanal = precioHora * cantHoras;
            System.out.println("la ganancia semanal fue de " + ganaSemanal);
            ganaMensual = ganaSemanal * 4;
            System.out.println("la ganancia mensual fue de " + ganaMensual);

        } else {
            System.out.println("Revise que las horas esten correctas");
        }

    }
}
