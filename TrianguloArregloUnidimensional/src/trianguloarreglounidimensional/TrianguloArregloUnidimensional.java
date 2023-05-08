/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloarreglounidimensional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */

public class TrianguloArregloUnidimensional {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int Lados [] = new int [3];

        for (int i = 0; i < Lados.length; i++)
        {
            System.out.println("Escribe el lado " + (i + 1) + ":");
            Lados[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < Lados.length; i++)
        {
            if (Lados[0] == Lados[1] && Lados[1] == Lados[2]) {
                System.out.println("El triangulo mostrado es un triangulo equilatero");
            }
            else
            {
            if (Lados[0] != Lados[1] && Lados[1] != Lados[2]) {
                System.out.println("El triangulo mostrado es un triangulo isoceles");
            }
            else
            {
            if (Lados[1] != Lados[2] && Lados[1] != Lados[2])
                System.out.println("El triangulo mostrado es un triangulo escaleno");
            }
            }
        }
    }
}