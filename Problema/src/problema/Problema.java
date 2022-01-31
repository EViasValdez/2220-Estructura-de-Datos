/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Problema {

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
        
        a = leer.nextInt(System.in);
        b = leer.nextInt(System.in);
        c = leer.nextInt(System.in);
        
        if (a + b = c){
            System.out.println("Son iguales");    
        }
        else (a + c = b){
            System.out.println("Son iguales");    
        }
    }
}