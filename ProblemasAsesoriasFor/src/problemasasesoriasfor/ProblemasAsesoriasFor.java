/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemasasesoriasfor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */
public class ProblemasAsesoriasFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        Scanner Leer = new Scanner (System.in);

        System.out.println("Problema 1");

        float Calificacion1, Calificacion2, Calificacion3, Calificacion4;
        float Promedio;
        
        for (int a = 1; a < 3; a++)
        {
            System.out.println("Ingese calificacion 1");
            Calificacion1 = Float.parseFloat(br.readLine());
            System.out.println("Ingrese calificacion 2");
            Calificacion2 = Float.parseFloat(br.readLine());
            System.out.println("Ingrese calificacion 3");
            Calificacion3 = Float.parseFloat(br.readLine());
            System.out.println("Ingrese calificacion 4");
            Calificacion4 = Float.parseFloat(br.readLine());

            Promedio = (Calificacion1 +  Calificacion2 + Calificacion3 + Calificacion4) / 4;
            
            System.out.println("El Promedio es: " + Promedio);
        }
        
        System.out.println("Problema 2");
        float Base, Altura;
        float Area;
        
        for (int b = 1; b < 3; b++)
        {
            System.out.println("Ingrese base");
            Base = Float.parseFloat(br.readLine());
            System.out.println("Ingese Altura");
            Altura = Float.parseFloat(br.readLine());
        
            Area = (Base * Altura) / 2;
            System.out.println("El area es: " + area);
        }

        System.out.println("Problema 3");
        float Radio;
        double pi = 3.1416;
        float Area2;
        
        for (int c = 1; c < 3; c++)
        {
            System.out.println("Ingese radio");
            radio = Float.parseFloat(br.readLine());

            Area2 = (float) (pi * (radio * radio));
            System.out.println("El area es: " +  Area2);
            System.out.println("Problema 4");

            int LadoA;
            int LadoB;
            int LadoC;

            for (int d = 1; d < 3; d++)
            {
                System.out.println("Ingrese lado a");
                LadoA = Leer.nextInt();
                System.out.println("Ingrese lado b");
                LadoB = Leer.nextInt();
                System.out.println("Ingrese lado c");
                LadoC = Leer.nextInt();

                Area = LadoA + LadoB + LadoC;

                System.out.println("El area es: " + Area);
            }
        }

        System.out.println("Problema 5");
        int Numero;

        System.out.println("Ingese numero");
        Numero = Leer.nextInt();

        if (Numero > 0)
        {
            System.out.println("El numero es positivo");
        }
        else
        {
        if (Numero < 0)
        {
            System.out.println("El numero es negativo");
        }
        else
        if (Numero == 0)
        {
             System.out.println("El numero es neutro");
        }
        }

        System.out.println("Problema 6");
        float Cantidad;
        float Total1 = 0;
        
        for (int e = 1; e < 3; e++)
        {
            System.out.println("Ingrese cantidad");
            Cantidad = Float.parseFloat(br.readLine());
        
        if (cantidad >= 1000)
        {
            Total1 = Cantidad * 85;
        }
        else
        if (cantidad <= 1000)
        {
            Total1 = Cantidad * 90;
        }
            System.out.println(Total1);
        }

        System.out.println("Problema 7");
        float Cantidad1;
        float Cantidad2;
        float Cantidad3;

        for (int f = 1; f < 3; f++)
        {
            System.out.println("Ingrese cantidad 1");
            Cantidad1 = Float.parseFloat(br.readLine());
            System.out.println("Ingrese cantidad 2");
            Cantidad2 = Float.parseFloat(br.readLine());
            System.out.println("Ingrese cantidad 3");
            Cantidad3 = Float.parseFloat(br.readLine());

            if (Cantidad1 > Cantidad2 && Cantidad1 > Cantidad3)
            {
                System.out.println("Cantidad 1 es mayor");
            }
            else
            {
            if (Cantidad2 > Cantidad1 && Cantidad2 > Cantidad3)
            {
                System.out.println("Cantidad 2 es mayor");
            }
            else
            if (Cantidad3 > Cantidad1 && Cantidad3 > Cantidad2)
            {
                System.out.println("Cantidad 3 es mayor");
            }
            }
        }

        System.out.println("Problema 8");
        float Numeroalumnos;
        float Total2 = 0;

        for (int g = 1; g < 3; g++)
        {
            System.out.println("Ingrese numero de alumnos");
            Numeroalumnos = Float.parseFloat(br.readLine());

        if (NumeroAlumnos >= 100)
        {
            Total2 = 65 * NumeroAlumnos;
        }
        else
        if (NumeroAlumnos >= 50 && NumeroAlumnos <= 99)
        {
            Total2 = 70 * NumeroAlumnos;
        }
        else
        if (NumeroAlumnos >= 30 && NumeroAlumnos <= 45)
        {
            Total2 = 95 * NumeroAlumnos;
        }
        }
        System.out.println("El total es: " + Total2 + 1000);
    }
}