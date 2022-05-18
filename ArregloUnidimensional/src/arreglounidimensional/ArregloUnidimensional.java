/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglounidimensional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */
public class ArregloUnidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        String nombres [] = {"Juan", "Luis", "Maria"}; // Arreglo unidimensional de tipo String llamado "nombres" con valores iniciales.
        int numerodepiezas [] = {23, 45, 67, 89, 98}; // Arreglo unidimensional de tipo entero llamado "numerodepiezas" con valores iniciales.
        float calificaciones [] = {7.4f, 8.5f, 9.6f, 10, 5, 6.7f}; // Arreglo unidimensional de tipo float llamado "calificaciones" con valores
        // iniciales hay que recordar que como los valores son float se les agrega la letra "f" al final de cada valor.
        char vocales [] = {'a', 'e', 'i', 'o', 'u'}; // Arreglo unidimensional de tipo caracter llamado "vocales" con valores iniciales.
        boolean tiene_auto [] = {true, false, false, true, false}; // Arreglo unidimensional de tipo booleano llamado "tiene_auto" con valores iniciales.
        String Apellidos [] = new String [8]; // Arreglo unidimensional de tipo String llamado "apellidos" de tamaño 8.
        // El nombre del arreglo se instancia con la palabra resdervada new al tipo de dato del arreglo en este caso String y su tamaño entre corchetes.
        double salario [] = new double [10]; // Arreglo unidimensional de tipo double llamado "salario" de tamaño 10.
        double suma = 0, promedio = 0; // Variable "suma" inicializada en cero ya que sera una variable de tipo acumulador, promedio igual a cero sera el resultado de un operacion.
        int alto = 0, bajo = 0; // Variable de tipo contador inicializadas en 0.

        System.out.println("El nombre de la posicion uno del arreglo nombres es: " + nombres [1]); // Muesrta el dato que se almaceno en la posicion 1 del arreglo en este caso "Luis".
        System.out.println("El numero de piezas de la posicion dos del arreglo numerodepiezas es: " + numerodepiezas [2]); // Dato de la posicion 2 del arreglo "numerodepiezas".
        System.out.println("La calificacion de la posicion uno del arreglo calificaciones es: " + calificaciones [0]);
        System.out.println("La vocal de la posicion cuatro del arreglo vocales es: " + vocales [4]);
        System.out.println("La respuesta a tiene auto de la posicion tres del arreglo tiene_auto es: " + tiene_auto [3]);

        // Mostrar todos los elementos del arreglo "nombres", se recorrera el arreglo con el ciclo for.
        for (int i = 0; i < nombres.length; i++){ // El metodo length hace regferencia a tamaño del arreglo es decir a 3.
            // Es mas eficiente utilizar este metodo ya que no se cometen errores en el tamaño del arreglo que hay que 
            // recordar que el tamaño del arreglo es 3 pero inicia su recorrido en la posicion 0 y termina en n - 1,
            // que es el tamaño del arreglo es decir termina en la posicion 2.
            System.out.println("El nombre de la posicion" + i + " es: " + nombres [i]); // Muestra la posicion del arreglo con la variable "i" y el dato de cada posicion del arreglo con "nombres [i]".
        }
        for (int j = 0; j < Apellidos.length; j++){ // Se recorre el arerglo "Apellidos" con la variable subindice "j" que inicia en 0 y termina hasta que sea menor al tamaño del arreglo.
            System.out.print("Escribe el apellido numero " + (j + 1) + ": "); // Como el arreglo inicia en cero se le sumo uno al subindice para que muestre el nuemro 1 primero.
            Apellidos [j] = br.readLine(); // Se ingresan los datos al arreglo "Apellidos" cada dato segun el subindice "j".
        }
        // Se recorre el arreglo "salario".
        for (int k = 0; k < salario.length; k++){
            System.out.print("Escribe el salario numero " + (k + 1) + ": "); // Como el arreglo inicia en cero se le sumo uno al subindice para que muestre el nuemro 1 primero.
            salario [k] = Double.parseDouble(br.readLine()); // Se ingresan los datos al arreglo salario cada dato segun el subindice "k".
        }
        // Se recorre el arreglo "salario".
        for (int k = 0; k < salario.length; k++){
            suma = suma + salario [k]; // Se realiza la suma de los salarios con la variable de tipo acumulador llamada "suma" se ira sumando cada salario de cada posicion del arreglo con el subindice "k" por ello "salario[k]".
            if (salario [k] >= 20000){ // Si "salario [k]" es mayor o igual a 20000 se sumara 1
                alto++; // a la variable "alto" ya que significa "alto = alto + 1".
            }else{ // Si la condicion anterior no se cumple
            if (salario [k] < 20000){ // se realiza esta condicion si el "salario [k]" es menor a 20000
                bajo++; // se suma 1 a la variable "bajo", es decir "bajo = bajo + 1".
            }
            }
        }

        System.out.println("Tamaño del arreglo salario: " + salario.length); // Imprime el tamaño del areglo.
        promedio = suma / salario.length; // Calcula el promedio de los salarios.
        System.out.println("El total de los salarios es: " + suma); // Muestra el total de los salarios.
        System.out.println("El promedio de los salarios es: " + promedio); // Imprime el promedio de los salarios.
        System.out.println("El total de los salarios altos es: " + alto); // Muestra el total de los salarios altos.
        System.out.println("El total de los salarios bajos es: " + bajo); // Muestra el total de los salarios bajos.
    
        // Es declarada la variable mayor a la cual se el asigna como valor inicial el dato de la posicion cero del arreglo "salario".
        double mayor = salario [0];
        
        for (int k = 0; k < salario.length; k++){ // Se recorre el arreglo "salario".
            if (mayor < salario [k]){ // Si la variable mayor es menor al valor de la posicion
                mayor = salario [k]; // del arreglo "salario [k]" entonces ese valor se le asigna a la variable mayor.
            }
        }
        System.out.println("El salario mas alto es: " + mayor); // Muestra el salario mas alto.
    }
}