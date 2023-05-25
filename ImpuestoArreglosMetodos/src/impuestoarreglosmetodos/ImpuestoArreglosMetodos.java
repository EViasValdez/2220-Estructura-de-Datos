/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestoarreglosmetodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yayis (Correcciones por EViasValdez)
 */

public class ImpuestoArreglosMetodos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        // La clase "BuferredReader" se utiliza para convertir los datos
        // que se lean, ya que de forma predeterminada solo lee cadenas de caracteres.
        BufferedReader br = new BufferedReader(isr);
         // Se declararan los identificadores llamados "precio" de tipo float (cuyo arreglo es de tamaño 4).
        float Precio[] = new float[4]; // La variable global tendrá alcance en todo el main y en los otros métodos de este proyecto.
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Escribe el precio");
            // "int i = 0;" es el valor inicial del arreglo, es decir la primer posición del mismo.
            // "i < 4" es la condición de fin de ciclo, que lo repetirá 4 veces.
            // "i++" equivale a escribir "i = i + 1" refiriéndose al contador que realiza el numero de veces del ciclo.
            Precio[i] = Float.parseFloat(br.readLine());
        }
        Calculo(Precio);  // Se manda llamar al método "Calculo" y se le pasa como parámetro el arreglo llamado "precio".
    }
        // Es creado un método publico estatico de tipo void llamado "Calculo" que recibe como parámetro de entrada el arreglo "precio []".
    public static void Calculo(float[] Precio) {
        // Se utilizaran variables locales ya que solo funcionan en este método impuesto es una constante 
        // con un valor inicial de .05 y Total esta inicializada en cero por ser una variable que guarda el 
        // resultado de una operación.
        float Impuesto = .05f, Total = 0;
        // Se recorre el arreglo recibido Precio con el ciclo for.
        for (int i = 0; i < 4; i++) {
            // Se realiza el calculo del Total cada valor de cada posición del arreglo "Precio[i]".
            // Es multiplicado por el valor de la constante "impuesto".
            Total = Precio[i] + (Precio[i] * Impuesto);
            // Se imprime el resultado de cada calculo.
            System.out.println("El total es: " + Total);
        }
    }
}