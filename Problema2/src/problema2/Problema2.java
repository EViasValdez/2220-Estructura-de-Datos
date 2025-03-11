/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */

public class Problema2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A;
        int B;
        int C;

        Scanner Leer = new Scanner(System.in);

        int i = 1;

        while (i < 4) {
            System.out.println("Inserte valores");

            System.out.println("Valor A");
            A = Leer.nextInt();
            System.out.println("Valor B");
            B = Leer.nextInt();
            System.out.println("Valor C");
            C = Leer.nextInt();

            if (A + B == C)
            {
                System.out.println("Son iguales " + A + "+" + B + " = " + C);
            }
            else
            {
            if (A + C == B)
            {
                System.out.println("Son iguales " + A + "+" + C + " = " + B);
            }
            else
            {
            if (B + C == A)
            {
                System.out.println("Son iguales " + B + "+" + C + " = " + A);
            }
            else
            {
                System.out.println("Son distintos");
            }
            }
            }
            i++;
        }
    }
}