/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoguia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */
public class CodigoGuia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        double calificacion [] = new double [4];
        double suma = 0, promedio = 0;

        for (int i = 0; i < 4; i++)
        {
            System.out.println("Escribe la calificacion");
            calificacion [i] = Double.parseDouble(br.readLine());

            suma = (suma + calificacion [i]);
        }
        promedio = suma / 4;
        System.out.println("El promedio es: " + promedio);
    }
}