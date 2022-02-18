/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemasasesoriasdowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Biblioteca digital
 */
public class ProblemasAsesoriasDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Problema 1");
        float calificacion1, calificacion2, calificacion3, calificacion4;
        float promedio;
        
        int a = 1;
        
        do
        {
            System.out.println("Ingese calificacion 1");
            calificacion1 = Float.parseFloat(br.readLine());
            System.out.println("Ingrese calificacion 2");
            calificacion2 = Float.parseFloat(br.readLine());
            System.out.println("Ingrese calificacion 3");
            calificacion3 = Float.parseFloat(br.readLine());
            System.out.println("Ingrese calificacion 4");
            calificacion4 = Float.parseFloat(br.readLine());
        
            promedio = (calificacion1 +  calificacion2 + calificacion3 + calificacion4)/4;
        
            System.out.println("El promedio es " + promedio);
        } while (a < 3);
        
        
        System.out.println("Problema 2");
        float base, altura;
        float area;
        
        int b = 1;
        
        do
        {
            System.out.println("Ingrese base");
            base = Float.parseFloat(br.readLine());
            System.out.println("Ingese altura");
            altura = Float.parseFloat(br.readLine());
        
            area = (base * altura) / 2;
            System.out.println("El area es " + area);
        } while (b < 3);
        
        System.out.println("Problema 3");
        float radio;
        double pi = 3.1416;
        float area2;
        
        int c = 1;
        
        do
        {
            System.out.println("Ingese radio");
            radio = Float.parseFloat(br.readLine());
            area2 = (float) (pi * (radio * radio));
            System.out.println("El area es " +  area2);

            System.out.println("Problema 4");
        
            int ladoa;
            int ladoc;
            int ladob;
        
            System.out.println("Ingrese lado a");
            ladoa = leer.nextInt();
            System.out.println("Ingrese lado b");
            ladob = leer.nextInt();
            System.out.println("Ingrese lado c");
            ladoc = leer.nextInt();
        
            area = ladoa + ladob + ladoc;
        
            System.out.println("El area es " + area);
        } while (c > 3);
            System.out.println("Problema 5");
            int numero;
            int d = 1;
        
            System.out.println("Ingese numero");
            numero = leer.nextInt();
        
            if (numero > 0)
            {
                System.out.println("El numero es positivo");
            }
            else
            {
            if (numero < 0)
            {
                System.out.println("El numero es negativo");   
            }
            else
                if (numero == 0)
            {
                 System.out.println("El numero es neutro");
            }
            } while(d > 3);
        
        System.out.println("Problema 6");
        float cantidad;
        float total = 0;
        int e = 1;
        
        do
        {    
            System.out.println("Ingrese cantidad");
            cantidad = Float.parseFloat (br.readLine());
        
            if (cantidad >= 1000)
            {
                total = cantidad * 85;    
            }
            else
            if (cantidad <= 1000)
            {
                total = cantidad * 90;    
            }
            System.out.println(total);
        } while(e < 3);
        
        
        System.out.println("Problema 7");
        float cantidad1;
        float cantidad2;
        float cantidad3;
        int f = 1;
        
        do
        {
            System.out.println("Ingrese cantidad 1");
            cantidad1 = Float.parseFloat(br.readLine());
            System.out.println("Ingrese cantidad 2");
            cantidad2 = Float.parseFloat(br.readLine());
            System.out.println("Ingrese cantidad 3");
            cantidad3 = Float.parseFloat(br.readLine());
        
        if (cantidad1 > cantidad2 && cantidad1 > cantidad3)
        {
            System.out.println("Cantidad 1 es mayor");
        }
        else
        {
        if (cantidad2 > cantidad1 && cantidad2 > cantidad3)
        {
            System.out.println("Cantidad 2 es mayor");
        }
        else
        if (cantidad3 > cantidad1 && cantidad3 > cantidad2)
        {
            System.out.println("Cantidad 3 es mayor");
        }
        }
        } while(f < 3);
        
        System.out.println("Problema 8");
        float numeroalumnos;
        float total2 = 0;
        int g = 1;
        
        do
        {    
            System.out.println("Ingrese numero de alumnos");
            numeroalumnos = Float.parseFloat(br.readLine());

            if (numeroalumnos >= 100)
            {
                total2 = 65 * numeroalumnos;
            }
            else
            if (numeroalumnos >= 50 && numeroalumnos <= 99)
            {
                total2 = 70 * numeroalumnos;    
            }
            else
                if (numeroalumnos >= 30 && numeroalumnos <= 45)
            {
                total2 = 95 * numeroalumnos;
            }
            System.out.println("El total es " + total2 + 1000);
        } while(g < 3);
    }
}