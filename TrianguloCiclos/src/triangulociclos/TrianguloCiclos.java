/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulociclos;

import java.util.Scanner;

/**
 *
 * @author yayis (Correcciones por EViasValdez)
 */

public class TrianguloCiclos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int LadoA;
        int LadoB;
        int LadoC;

        Scanner Leer = new Scanner(System.in);

        int i = 1;

        while (i < 3) {
            System.out.println("Ponga sus cantidades");
            System.out.println("Inserte primera cantidad");
            LadoA = Leer.nextInt();
            System.out.println("Inserte segunda cantidad");
            LadoB = Leer.nextInt();
            System.out.println("Inserte tercera cantidad");
            LadoC = Leer.nextInt();

            if (LadoA == LadoB && LadoB == LadoC)
            {
                System.out.println("El triangulo mostrado es un triangulo equilátero");
            }
            else
            {
            if (LadoA != LadoB && LadoB != LadoC)
            {
                System.out.println("El triangulo mostrado es un triangulo isosceles");
            }
            else
            {
            if (LadoB != LadoC && LadoB != LadoC)
            {
                System.out.println("El triangulo mostrado es un triangulo escaleno");
            }
            }
            }
            i++;
        }
    }
}