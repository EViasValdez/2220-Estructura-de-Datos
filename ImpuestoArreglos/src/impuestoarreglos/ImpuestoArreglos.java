/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestoarreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yayis
 */
public class ImpuestoArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Clase Input la cual se utiliza para leer datos
        InputStreamReader isr = new InputStreamReader(System.in);
        //Clase Buferred Reader la cual se utiliza para convertir los datos qeu se lean
        // ya uqe por defautl solo lee cadenas de caractres
        BufferedReader br = new BufferedReader(isr);
        //se declararon los identificadores llamados precio de tipo float -Arreglo de tamaño 4  - asi como impuesto
        // solo que esta es una constante ya tiene deifnido un valor 0.05f la f se le agrega
        //para especificar qeu es de tipo flotante y total - varibale - inicializada en cero
        //debido a que no se conoce el valor de la variable por ser el resultado de una operacion
        //es decir todas las variables que sean el resultado de una operacion se inicializan con 0
        // pues no se conoce su valor, no se va a leer y ademas para limpiar la variable es decir 
        // que no traiga basura como valor inicial
        float precio[] = new float [4], impuesto = .05f, total=0; //todas las variables con gobales
        
        for(int i = 0; i<4; i++){
            //Se recorre con el ciclo for el arreglo
            // int i = 0; es el valor inicial del arreglo, es decir la primer posicion del mismo
            // i<4 es la condicion de fi de ciclo, es decir lo va a repetir 4 veces
            // i++ equivale a escribir i=i+1 es decir es el contador que realiza el numero de veces del ciclo
        
            System.out.println("Escribe el Precio :");
            //Se lee la variable precio[i] ya que por tener corchetes es un arreglo, lee datos y los asigna a las posiciones del arreglo
            //la linea qeu se lee con el objeto br y el metodo readline
            // se convierte a un dato de tipo float con el metodo parse float
            // que pertenece a la clase de los Float y se le asigna a la variable precio
            precio[i] = Float.parseFloat(br.readLine());
            // se realiza la operacion del porcentaje, cada dato en cada posicion del arreglo precio[i]
            total = precio[i] + (precio[i] * impuesto);
            //Se envia un mensaje para imprimir el total de la variable  a la que se le asigno el valor del total
            System.out.println("Total a pagar con impuesto " + total);
    }
    }
}