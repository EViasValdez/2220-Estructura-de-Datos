/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocalificaciones;

import java.util.Scanner;

/**
 *
 * @author yayis (Correcciones por EViasValdez)
 */

public class EjercicioCalificaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);

        float Promedio, Suma = 0;
        float C1;
        // float C2;
        // float C3;
        // float C4;
        int i = 1;

        while (i <= 4)
        {
            System.out.println("Ingresa la calificación");
            C1 = Leer.nextFloat();
            // System.out.println("Ingresa la calificación");
            // C2 = Leer.nextFloat();
            // System.out.println("Ingresa la calificación");
            // C3 = Leer.nextFloat();
            // System.out.println("Ingresa la calificación");
            // C4 = Leer.nextFloat();
            if (C1 >= 7)
            {
                System.out.println("Aprobado");
            }
            else
            {
                System.out.println("Reprobado");
            }
            // if (C2 >= 7)
            // {
            //     System.out.println("Aprobado");
            // }
            // else
            // {
            //     System.out.println("Reprobado");
            // }
            // if (C3 >= 7)
            // {
            //     System.out.println("Aprobado");
            // }
            // else
            // {
            //     System.out.println("Reprobado");
            // }
            // if (C4 >= 7)
            // {
            //     System.out.println("Aprobado");
            // }
            // else
            // {
            //     System.out.println("Reprobado");
            // }
            
            Suma = Suma + C1;
        i++;
        }
        Promedio = Suma / 4;
        System.out.println("Tu Promedio es: " + Promedio);
    }
}