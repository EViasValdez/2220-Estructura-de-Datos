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
 * @author EViasValdez
 */

public class ProblemasAsesoriasDoWhile {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Scanner leer = new Scanner(System.in);

        System.out.println("Problema 1");
        float Calificacion1, Calificacion2, Calificacion3, Calificacion4;
        float Promedio;
        int a = 1;

        do
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

            System.out.println("El promedio es: " + Promedio);
        } while (a < 3);
        
        System.out.println("Problema 2");
        float Base, altura;
        float Area;
        int b = 1;

        do
        {
            System.out.println("Ingrese base");
            Base = Float.parseFloat(br.readLine());
            System.out.println("Ingese altura");
            altura = Float.parseFloat(br.readLine());

            Area = (Base * altura) / 2;
            System.out.println("El area es " + Area);
        } while (b < 3);

        System.out.println("Problema 3");
        float Radio;
        double pi = 3.1416;
        float area2;

        int c = 1;

        do
        {
            System.out.println("Ingese radio");
            Radio = Float.parseFloat(br.readLine());
            area2 = (float) (pi * (Radio * Radio));
            System.out.println("El area es " +  area2);

            System.out.println("Problema 4");

            int LadoA;
            int LadoB;
            int LadoC;

            System.out.println("Ingrese lado a");
            LadoA = leer.nextInt();
            System.out.println("Ingrese lado b");
            LadoB = leer.nextInt();
            System.out.println("Ingrese lado c");
            LadoC = leer.nextInt();

            Area = LadoA + LadoB + LadoC;

            System.out.println("El area es " + Area);
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
        } while (d > 3);

        System.out.println("Problema 6");
        float Cantidad;
        float Total = 0;
        int e = 1;

        do
        {
            System.out.println("Ingrese cantidad");
            Cantidad = Float.parseFloat(br.readLine());
            
            if (Cantidad >= 1000)
            {
                Total = Cantidad * 85;
            }
            else
            if (Cantidad <= 1000)
            {
                Total = Cantidad * 90;
            }
            System.out.println(Total);
        } while (e < 3);

        System.out.println("Problema 7");
        float Cantidad1;
        float Cantidad2;
        float Cantidad3;
        int f = 1;

        do
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
        } while (f < 3);

        System.out.println("Problema 8");
        float NumeroAlumnos;
        float Total2 = 0;
        int g = 1;

        do
        {
            System.out.println("Ingrese numero de alumnos");
            NumeroAlumnos = Float.parseFloat(br.readLine());

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
            System.out.println("El total es: " + Total2 + 1000);
        } while (g < 3);
    }
}