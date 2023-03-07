/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglobidimensional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yayis (Correcciones por EViasValdez)
 */

public class ArregloBidimensional {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        // 3 parciales calificación de dos alumnos.
        float Calificaciones [] [] = new float [2] [3];
        float Suma = 0, Promedio = 0;

        for (int k = 0; k < 2; k++)
        {
            Suma = 0;
            for (int i = 0; i < 3; i++)
            {
                System.out.print("Escribe la calificacion del alumno " + k + " y de la materia " + i + ": ");
                Calificaciones [k] [i] = Float.parseFloat(br.readLine());
                Suma = Suma + Calificaciones [k] [i];
            }
            System.out.println("La suma es: " + Suma);
            Promedio = Suma / 3;
            System.out.println("El promedio del alumno es: " + Promedio);
        }
    }
}