/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestociclos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yayis (Correcciones por EViasValdez)
 */
public class ImpuestoCiclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // La clase Input se utiliza para leer datos.
        InputStreamReader isr = new InputStreamReader (System.in);
        // La clase BufferedReader se utiliza para convertir los datos que
        // se lean ya que de forma predeterminada solo lee cadenas de caracteres.
        BufferedReader br = new BufferedReader (isr);
        // Se declararon los identificadores llamados "precio" de tipo float (variable) asi como "impuesto"
        // solo que esta es una constante ya tiene definido un valor 0.05f la "f" se le agrega para especificar
        // que es de tipo flotante y "total" (variable) inicializada en cero debido a que no se conoce el valor
        // de la variable por ser el resultado de una operación es decir todas las variables que sean el resultado
        // de una operación se inicializan con 0 pues no se conoce su valor, no se va a leer y ademas para limpiar
        // la variable para que no traiga basura como valor inicial.
        float Precio, Impuesto = .05f, Total = 0;
        int i = 0;
        // Variable de tipo entero Valor Inicial del ciclo,
        // mientras i sea menor a 4 - condición de fin de ciclo.
        while (i < 4) {
            // Se envía un mensaje en pantalla el cual mostrara "Escribe el precio".
            System.out.println("Escribe el precio");
            // Es leída la variable "precio" la linea que se lee con el objeto br y el método readline
            // se convierte a un dato de tipo float con el método parse float que pertenece a la
            // clase de los Float y se le asigna a la variable "precio".
            Precio = Float.parseFloat(br.readLine());
            // Se realiza la operación del porcentaje.
            Total = Precio + (Precio * Impuesto);
            // Es enviado un mensaje para imprimir el total de la variable a la que se le asigno el valor del total.
            System.out.println("Total a pagar con impuesto: " + Total);
            i++; // Contador para ir incrementando el ciclo "i = i + 1".
        }
    }
}