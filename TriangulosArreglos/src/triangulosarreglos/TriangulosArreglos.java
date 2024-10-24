/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulosarreglos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */

public class TriangulosArreglos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int LadoA;
        int LadoB;
        int LadoC;

        int Lado [] = new int[3];

        Scanner Leer = new Scanner(System.in);

        System.out.println("Ponga sus cantidades");
        System.out.println("Inserte primera cantidad");
        LadoA = Leer.nextInt();
        System.out.println("Inserte segunda cantidad");
        LadoB = Leer.nextInt();
        System.out.println("Inserte tercera cantidad");
        LadoC = Leer.nextInt();

        if (LadoA == LadoB && LadoB == LadoC)
        {
            System.out.println("El triangulo mostrado es un triangulo equilatero");
        }
        else
        {
        if (LadoA != LadoB && LadoB != LadoC)
        {
            System.out.println("El triangulo mostrado es un triangulo isoceles");
        }
        else
        {
        if (LadoB != LadoC && LadoB != LadoC)
        {
            System.out.println("El triangulo mostrado es un triangulo escaleno");
        }
        }
        }
    }
}