/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoguia1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */

public class CodigoGuia1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        double Calificacion1, Calificacion2, Calificacion3, Calificacion4, Suma = 0, Promedio = 0;
        int Contador = 0;

        while (Contador <= 4)
        {
            System.out.println("Escribe la calificacion 1");
            Calificacion1 = Double.parseDouble(br.readLine());
            System.out.println("Escribe la calificacion 2");
            Calificacion2 = Double.parseDouble(br.readLine());
            System.out.println("Escribe la calificacion 3");
            Calificacion3 = Double.parseDouble(br.readLine());
            System.out.println("Escribe la calificacion 4");
            Calificacion4 = Double.parseDouble(br.readLine());

            Suma = (Calificacion1 + Calificacion2 + Calificacion3 + Calificacion4);
            Promedio = Suma / 4;

            Contador = Contador + 1;
        }
        System.out.println("El promedio es " + Promedio);
    }
}