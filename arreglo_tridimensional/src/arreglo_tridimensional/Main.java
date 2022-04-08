/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglo_tridimensional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Kevin_Enoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        // 3 parciales de 4 calificaciones de dos alumnos.
        float Calificaciones [] [] [] = new float [4] [3] [2];
        float suma = 0, promedio = 0;
        
        for (int k = 0; k < 2; k++)
        {
            suma = 0;
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                     System.out.print("Escribe tu calificacion del alumno " + k + " del parcial" + i + " de la materia " + j + ": ");
                     Calificaciones [j] [i] [k] = Float.parseFloat(br.readLine());
                     suma = suma + Calificaciones [j] [i] [k];
                }
            }
            System.out.println("La suma es: " + suma);
            promedio = suma / 12;
            System.out.println("El promedio del alumno" + k +  " es: " + promedio);
        }
    }