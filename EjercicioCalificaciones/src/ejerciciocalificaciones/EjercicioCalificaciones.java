/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocalificaciones;

import java.util.Scanner;

/**
 *
 * @author yayis
 */
public class EjercicioCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float promedio, suma =0;
        float c1;
        // float c2;
        // float c3;
        // float c4;
        int i = 1;
        while(i <= 4){
            System.out.println("ingresa la calificacion 1: ");
            c1 = leer.nextFloat();
            // System.out.println("ingresa la calificacion 2: ");
            // c2 = leer.nextFloat();
            // System.out.println("ingresa la calificacion 3: ");
            // c3 = leer.nextFloat();
            // System.out.println("ingresa la calificacion 4: ");
            // c4 = leer.nextFloat();
            if(c1 >= 7)
            {
                System.out.println("aprobado");
            }
            else
            {
                System.out.println("reprobado");  
            }
            // if(c2 >= 7)
            // {
            //     System.out.println("aprobado");
            // }
            // else
            // {
            //     System.out.println("reprobado");  
            // }
            // if(c3 >= 7)
            // {
            //     System.out.println("aprobado");
            // }
            // else
            // {
            //     System.out.println("reprobado");  
            // }
            // if(c4 >= 7)
            // {
            //     System.out.println("aprobado");
            // }
            // else
            // {
            //     System.out.println("reprobado");  
            suma = suma + c1;
        i++;
        }
        promedio = suma/4;
        System.out.println("tu promedio es:" + promedio);
    }
}