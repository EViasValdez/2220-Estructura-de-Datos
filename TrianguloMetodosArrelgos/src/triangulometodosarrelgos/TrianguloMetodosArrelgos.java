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
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        int ladoa;
        int ladob;
        int ladoc;

        int lado [] = new int [3];

        Scanner leer = new Scanner (System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ponga sus cantidades");
            lado [i] = Integer.parseInt(br.readLine());
        }
        triangulo (lado);
    }
    public static void triangulo(int lado[]) {
        for (int i = 0; i < 3; i++) {
            if (lado [0] == lado [1] && lado [2] == lado [0]){
                System.out.println("El triangulo mostrado es un triangulo equilatero");
            }
            else
            {
            if (lado [0] != lado [1] && lado [2] != lado [0]){
                System.out.println("El triangulo mostrado es un triangulo isoceles");
            }
            else
            {
            if (lado [0] != lado [1] && lado [2] != lado [0])
                System.out.println("El triangulo mostrado es un triangulo escaleno");
            }
            }
        }
    }
}