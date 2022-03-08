/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulometodos;

import java.util.Scanner;

/**
 *
 * @author Biblioteca digital
 */
public class TrianguloMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ladoa;
        int ladob;
        int ladoc;
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ponga sus cantidades");
        System.out.println("Inserte primera cantidad");
        ladoa = leer.nextInt();
        System.out.println("Inserte segunda cantidad");
        ladob = leer.nextInt();
        System.out.println("Inserte tercera cantidad");
        ladoc = leer.nextInt();
        
        triangulo (ladoa, ladob, ladoc);
    }
    public static void triangulo(int ladoa, int ladob, int ladoc) {
        if (ladoa == ladob && ladob == ladoc){
            System.out.println("El triangulo mostrado es un triangulo equilatero");    
        }
        else
        {
        if (ladoa != ladob && ladob != ladoc){
            System.out.println("El triangulo mostrado es un triangulo isoceles");    
        }
        else
        {
        if (ladob != ladoc && ladob != ladoc)
            System.out.println("El triangulo mostrado es un triangulo escaleno");    
        }
        }
    }
}