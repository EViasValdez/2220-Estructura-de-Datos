/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Eduardo
 */
public class EjercicioColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        
        int colaimpresion;
        
        System.out.println("Seleccione una opcion");
        System.out.println("1");
        System.out.println("2");
        
        Queue <Integer> cola = new LinkedList<>();
        
        int n;
        
        System.out.println(cola);
        System.out.println("¿Cuantos elementos quiere agregar?");
        colaimpresion = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= colaimpresion; i++)
        {
            System.out.println("Documentos a imprimir: " + i);
            cola.add (i);
        }
        
        System.out.println("El principal es");
        int primero = cola.peek();
        System.out.println(primero);
        System.out.println(cola);
        
        System.out.println("Elemento a quitar");
        int remover = cola.remove();
        System.out.println("Error " + remover);
        System.out.println(cola);
        System.out.println("El ultimo es");
        }
    }