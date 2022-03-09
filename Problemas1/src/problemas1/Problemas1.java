/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas1;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Problemas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        int c;
        
        Scanner leer = new Scanner (System.in);
        
        int i = 1;
        while (i < 4){
        System.out.println("Insterte Valores");
        
        System.out.println("Valor A");
        a = leer.nextInt();
        System.out.println("Valor B");
        b = leer.nextInt();
        System.out.println("Valor C");
        c = leer.nextInt();
        
        if (a + b == c){
            System.out.println("Son iguales " + a + "+ " + b + " = " + c);
        }
        else{
        if (a + c == b){
            System.out.println("Son iguales " + a + " + " + c + " = " + b);    
        }
        else{
        if (b + c == a){
            System.out.println("Son iguales " + b + " + " + c + " = " + a);    
        }
        else{
            System.out.println("Son distintos");    
        }
        }
        }
        i++;
        }
    }
}