/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */
public class Actividades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Elige un problema");
        System.out.println("1. Captura de las Ventas de un comisionista de forma mensual");
        System.out.println("2. Captura de las Ventas de 30 comisionistas de forma mensual");
        System.out.println("3. Captura de las Ventas de 20 comisionistas de forma mensual y de cinco productos diferentes");
        System.out.println("4. Controlar los autos que entran en un estacionamiento");
        
        Scanner leer = new Scanner (System.in);
        
        int El = 0;
        El = leer.nextInt();
        
        switch (El) {
        case 1:
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            
            Queue <Integer> Ventas = new LinkedList<>();
            
            int Ingr, Venta;
            
            System.out.println("Ingrese cuantas ventas");
            Ingr = Integer.parseInt(br.readLine());
            
            for (int i = 0; i <= Ingr; i++)
            {
                System.out.println("Monto de ventas");
                Venta = Integer.parseInt(br.readLine());
                Ventas.add (Venta);
            }
            
            System.out.println("Sus ingresos son");
            System.out.println(Ventas);
            
            System.out.println("El mayor es");
            int Arriba = Ventas.peek();
            
            System.out.println(Arriba);
            System.out.println(Ventas);
        break;

        case 2:
        break;
        
        case 3:
        break;

        case 4:
        break;
        
        }
    }
}