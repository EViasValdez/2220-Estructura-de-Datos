/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */

public class Problema1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int A;
        int B;
        int C;

        System.out.println("Test con tres numeros");

        A = leer.nextInt();
        B = leer.nextInt();
        C = leer.nextInt();

        if (A + B == C) {
            System.out.println("");
            System.out.println("Son iguales");
        }
        else if (A + C == B) {
            System.out.println("");
            System.out.println("Son iguales");
        }
        else if (B + C == A) {
            System.out.println("");
            System.out.println("Son iguales");
        }
        else {
            System.out.println("");
            System.out.println("Son distintos");
         }
    }
}