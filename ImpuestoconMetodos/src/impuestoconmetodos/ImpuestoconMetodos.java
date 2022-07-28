/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestoconmetodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yayis (Correciones por EViasValdez)
 */
public class ImpuestoconMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // La clase InputStreamReader se utiliza para leer datos.
        InputStreamReader isr = new InputStreamReader (System.in);
        // La clase BuferredReader se utiliza para convertir los datos que se lean,
        // ya que de forma predeterminada solo lee cadenas de caracteres.
        BufferedReader br = new BufferedReader (isr);
        // Se declararon los identificadores llamados "precio" (variable de tipo float) asi como "impuesto", solo que
        // esta es una constante ya tiene definido un valor 0.05f, la f se le agrega para especificar que es de tipo
        // flotante y total (variable) inicializada en cero debido a que no se conoce el valor de la variable por ser
        // el resultado de una operación es decir todas las variables que sean el resultado de una operación se 
        // inicializan con 0 pues no se conoce su valor, no se va a leer y ademas para limpiar la variable es
        // decir que no traiga basura como valor inicial.
        float precio; // La variable tiene alcance en el main y en los demás métodos del programa.
        // Se envía un mensaje en pantalla el cual mostrara "Escribe el precio".
        System.out.println("Escribe el precio");
        // Se lee la variable precio la linea que se lee con el objeto "br" y con el método readline,
        // se convierte a un dato de tipo float con el método parse float
        // perteneciente a la clase de los Float y se le asigna a la variable "precio".
        precio = Float.parseFloat(br.readLine());
        // Se envía un mensaje para imprimir el total de la variable a la que se le asigno el valor del 
        // total, solo que se manda llamar al método "calculo" y se le pasa como parámetro la variable "precio"
        // va y busca en el main al método "calculo".
        System.out.println("Total a pagar con impuesto: " + calculo (precio));
    }
    public static float calculo(float precio) { // Método calculo.
        // Varibales locales de este método "impuesto" y "total", se realizar la operación del porcentaje.
       float impuesto = .05f, total = 0;
       total = precio + (precio * impuesto); // Se realiza el calculo del total.
       return total; // return (que significa retornar o regresar) lleva de regreso al main en donde fue llamado
       // el método "calculo", en este caso en la linea 47 y regresa el valor de la variable "total".
    }
}