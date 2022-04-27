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
 * @author yayis
 */
public class ImpuestoArreglosMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        // Clase "BuferredReader" la cual se utiliza para convertir los datos
        // que se lean ya que por default solo lee cadenas de caractres.
        BufferedReader br = new BufferedReader (isr);
         // Se declararan los identificadores llamados "precio" de tipo float (cuyo arreglo es de tamaño 4).
        float precio [] = new float [4]; // La variable global tendra alcance en todo el main y en los otros metodos de este proyecto.
        
        for (int i = 0; i < 4; i++){
            System.out.println("Escribe el precio");
            // "int i = 0;"" es el valor inicial del arreglo, es decir la primer posicion del mismo.
            // "i < 4" es la condicion de fin de ciclo, que lo repetira 4 veces.
            // i++ equivale a escribir "i = i + 1" refiriendose al contador que realiza el numero de veces del ciclo.
            precio [i] = Float.parseFloat(br.readLine());
        }
        calculo (precio);  // Se manda llamar al metodo "caluclo" y se le pasa como parametro el arreglo llamado "precio".
    }
        // Es creado un metodo publico estatico de tipo void llamado "calculo" que recibe como parametro de entrada el arreglo "precio []".
    public static void calculo(float [] precio){
        // Se utilizaran variables locales ya que solo funcionan en este metodo impuesto es una constante con un valor iniciar de
        // .05 y total esta inicializada en cero por ser una variable que guarda el resultado de una operacion.
        float impuesto = .05f, total = 0;
        // Se recorre el arreglo recibido precio con el ciclo for.
        for (int i = 0; i < 4; i++){
            // Se realiza el calculo del total cada valor de cada posicion del arreglo "precio [i]".
            // Es multiplicado por el valor de la constante "impuesto".
            total = precio [i] + (precio [i] * impuesto);
            // Se imprime el resulatdo de cada calculo.
            System.out.println("El total es: " + total);
        }
    }
}