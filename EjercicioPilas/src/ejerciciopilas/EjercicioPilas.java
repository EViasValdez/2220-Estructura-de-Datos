/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 * @author ALUMNOS
 */
public class EjercicioPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        
        Stack <Integer> pil = new Stack<Integer>();
        
        System.out.println("¿Cuantos elementos se agregaran?");
        int n = Integer.parseInt(br.readLine());
        
        for (int i = n; i <= 10; i++)
        {
            System.out.println("Elemento: " + (i));
            pil.add(i);
        }
    }
}