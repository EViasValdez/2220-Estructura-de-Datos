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
 * @author yayis
 */
public class ImpuestoconMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // Clase InputStreamReader la cual se utiliza para leer datos.
        InputStreamReader isr = new InputStreamReader (System.in);
        // Clase BuferredReader la cual se utiliza para convertir los datos que se lean,
        // ya que por default solo lee cadenas de caractres.
        BufferedReader br = new BufferedReader (isr);
        // Se declararon los identificadores llamados precio de tipo float -variable - asi como impuesto,
        // solo que esta es una constante ya tiene deifnido un valor 0.05f la f se le agrega
        // para especificar que es de tipo flotante y total - varibale - inicializada en cero
        // debido a que no se conoce el valor de la variable por ser el resultado de una operacion
        // es decir todas las variables que sean el resultado de una operacion se inicializan con 0
        // pues no se conoce su valor, no se va a leer y ademas para limpiar la variable es decir
        // que no traiga basura como valor inicial.
        float precio; // variable global es decir tiene alcance en el main y en los demas metodos del programa.
        // Se envia un mensaje en pantalla el cual mostrara "Escribe el precio".
        System.out.println("Escribe el precio");
        // Se lee la variable precio la linea que se lee con el objeto "br" y con el metodo readline,
        // se convierte a un dato de tipo float con el metodo parse float
        // que pertenece a la clase de los Float y se le asigna a la variable "precio".
        precio = Float.parseFloat(br.readLine());
        // Se envia un mensaje para imprimir el total de la variable  a la que se le asigno el valor del total,
        // solo que se manda llamar al metodo calculo y se le pasa como parametro la variable precio va y
        // busca en el main al metodo "calculo".
        System.out.println("Total a pagar con impuesto: " + calculo (precio));
    }
    public static float calculo (float precio) { // Metodo calculo.
        // Varibales locales de este metodo "impuesto" y "total", se realizar la operacion del porcentaje.
       float impuesto = .05f, total = 0;
       total = precio + (precio * impuesto); // Se realiza el calculo del total.
       return total; // return significa retornar o regresar regresa al main en donde fue llamado el metodo 
       // calculo, en este caso en la linea 47 y regresa el valor de la variable "total".
    }
}