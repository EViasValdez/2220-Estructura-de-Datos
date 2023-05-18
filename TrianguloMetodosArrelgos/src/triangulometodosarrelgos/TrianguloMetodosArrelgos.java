/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulometodosarrelgos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */

public class TrianguloMetodosArrelgos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int LadoA;
        int LadoB;
        int LadoC;

        int Lado[] = new int[3];

        Scanner Leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ponga sus cantidades");
            Lado[i] = Integer.parseInt(br.readLine());
        }
        Triangulo(Lado);
    }
    public static void Triangulo(int Lado[]) {
        for (int i = 0; i < 3; i++) {
            if (Lado[0] == Lado[1] && Lado[2] == Lado[0]) {
                System.out.println("El triangulo mostrado es un triangulo equilatero");
            }
            else
            {
            if (Lado[0] != Lado[1] && Lado[2] != Lado[0]) {
                System.out.println("El triangulo mostrado es un triangulo isoceles");
            }
            else
            {
            if (Lado[0] != Lado[1] && Lado[2] != Lado[0]) {
                System.out.println("El triangulo mostrado es un triangulo escaleno");
            }
            }
            }
        }
    }
}