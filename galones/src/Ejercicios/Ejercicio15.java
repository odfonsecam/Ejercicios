/*
15.Realizar un programaque calcule el valor a pagar por algunos galones 
de gasolina si sabemos que cada litro de gasolina vale 9.500.Imprimir la 
cantidad de galones, precio por galón, cantidad de litros y precio a pagar.
* De: galones de gasolina.
  DS: cantidad de galones, cantidad por litros, precio en galones y 
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double cantGal;
        double precioGalon;
        double conversion;
        double valorPagado;

        cantGal = 0;
        precioGalon = 0;
        conversion = 0;
        valorPagado = 0;
        System.out.println("Ingrese cantidad de gasolina en galones ");
        Scanner lector = new Scanner(System.in);
        cantGal = lector.nextDouble();
        conversion = cantGal * 3.78;
        System.out.println("la cantidad de galones fue: " + cantGal);
        precioGalon = (conversion * 9500);
        System.out.println("El precio por galon es: " + precioGalon);
        System.out.println("la cantidad de litros es: " + conversion);
        valorPagado = conversion * 9500;
        System.out.println("el precio por pagar es:" + valorPagado);

    }

}
