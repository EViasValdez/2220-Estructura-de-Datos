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
        Scanner leer = new Scanner (System.in);

        int a;
        int b;
        int c;

        System.out.println("Test con tres numeros");

        a = leer.nextInt ();
        b = leer.nextInt ();
        c = leer.nextInt ();

        if (a + b == c) {
            System.out.println("");
            System.out.println("Son iguales");
        }
        else
        if (a + c == b) {
            System.out.println("");
            System.out.println("Son iguales");
        }
        else
        if (b + c == a) {
            System.out.println("");
            System.out.println("Son iguales");
        }
        else{
            System.out.println("");
            System.out.println("Son distintos");
         }
    }
}