/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoguia3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ALUMNOS
 */
public class CodigoGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        
        double calificacion1, calificacion2, calificacion3, calificacion4, suma = 0, promedio = 0;
        
        System.out.println("Escribe la calificacion 1");
        calificacion1 = Double.parseDouble(br.readLine());
        System.out.println("Escribe la calificacion 2");
        calificacion2 = Double.parseDouble(br.readLine());
        System.out.println("Escribe la calificacion 3");
        calificacion3 = Double.parseDouble(br.readLine());
        System.out.println("Escribe la calificacion 4");
        calificacion4 = Double.parseDouble(br.readLine());
        System.out.println("El promedio es: " + calificaciones (calificacion1, calificacion2, calificacion3, calificacion4));
    }
    public static double calificaciones (double calificiacion1, double calificacion2, double calificiacion3, double calificacion4) {
        double suma;
        double promedio;
        
        suma = (calificiacion1 + calificacion2 + calificiacion3 + calificacion4);
        promedio = suma / 4;
        
        return promedio;
    }