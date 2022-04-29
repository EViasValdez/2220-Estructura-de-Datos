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
 * @author ALUMNOS
 */
public class Actividades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Eliga un problema");
        System.out.println("1. Captura de las ventas de un comisionista de forma mensual");
        System.out.println("2. Captura de las ventas de 30 comisionistas de forma mensual");
        System.out.println("3. Captura de las ventas de 20 comisionistas de forma mensual y de cinco productos diferentes");
        System.out.println("4. Controlar los autos que entran en un estacionamiento");
        
        Scanner leer = new Scanner (System.in);
        
        int el = 0;
        el = leer.nextInt();
        
        switch (el){
        case 1:
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            
            Queue <Integer> ventas = new LinkedList<>();
            
            int ingr, venta;
            
            System.out.println("Ingrese cuantas ventas");
            ingr = Integer.parseInt(br.readLine());
            
            for (int i = 0; i <= ingr; i++)
            {
                System.out.println("Monto de ventas");
                venta = Integer.parseInt(br.readLine());
                ventas.add (venta);
            }
            
            System.out.println("Sus ingresos son");
            System.out.println(ventas);
            
            System.out.println("El mayor es");
            int arriba = ventas.peek();
            
            System.out.println(arriba);
            System.out.println(ventas);
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