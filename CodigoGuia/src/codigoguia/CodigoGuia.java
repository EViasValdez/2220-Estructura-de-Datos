/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoguia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ALUMNOS
 */
public class CodigoGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        double calificacion1, calificacion2,calificacion3,calificacion4, suma = 0, promedio = 0;
        int contador = 0;
        
        while (contador <= 4)
        {
            System.out.println("Escribe la calificaicon numero 1:");
            calificacion1= Double.parseDouble(br.readLine());
            System.out.println("Escribe la calificaicon numero 2:");
            calificacion2= Double.parseDouble(br.readLine());
            System.out.println("Escribe la calificaicon numero 3:");
            calificacion3= Double.parseDouble(br.readLine());
            System.out.println("Escribe la calificaicon numero 4:");
            calificacion4= Double.parseDouble(br.readLine());         
        
            suma = (calificacion1 + calificacion2 + calificacion3 + calificacion4);
            promedio = suma / 4;
        
            contador = contador + 1;
    }
        System.out.println("El promedio es " + promedio);
    }
}