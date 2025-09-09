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
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String Nombres [] = {"Juan", "Luis", "Maria"}; // Arreglo unidimensional de tipo String llamado "Nombres" con valores iniciales.
        int NumerodePiezas [] = {23, 45, 67, 89, 98}; // Arreglo unidimensional de tipo entero llamado "NumerodePiezas" con valores iniciales.
        float Calificaciones [] = {7.4f, 8.5f, 9.6f, 10, 5, 6.7f}; // Arreglo unidimensional de tipo float llamado "Calificaciones" con valores
        // iniciales hay que recordar que como los valores son float se les agrega la letra "f" al final de cada valor.
        char Vocales [] = {'a', 'e', 'i', 'o', 'u'}; // Arreglo unidimensional de tipo carácter llamado "Vocales" con valores iniciales.
        boolean TieneAuto [] = {true, false, false, true, false}; // Arreglo unidimensional de tipo booleano llamado "TieneAuto" con valores iniciales.
        String Apellidos [] = new String[8]; // Arreglo unidimensional de tipo String llamado "apellidos" de tamaño 8.
        // El nombre del arreglo se instancia con la palabra reservada new al tipo de dato del arreglo en este caso String y su tamaño entre corchetes.
        double Salario [] = new double[10]; // Arreglo unidimensional de tipo double llamado "Salario" de tamaño 10.
        double Suma = 0, Promedio = 0; // Variable "Suma" inicializada en cero ya que sera una variable de tipo acumulador, Promedio igual a cero sera el resultado de un operación.
        int Alto = 0, Bajo = 0; // Variable de tipo contador inicializadas en 0.

        System.out.println("El nombre de la posicion uno del arreglo Nombres es: " + Nombres[1]); // Muestra el dato que se almaceno en la posición 1 del arreglo en este caso "Luis".
        System.out.println("El numero de piezas de la posicion dos del arreglo NumerodePiezas es: " + NumerodePiezas[2]); // Dato de la posición 2 del arreglo "NumerodePiezas".
        System.out.println("La calificacion de la posicion uno del arreglo Calificaciones es: " + Calificaciones[0]);
        System.out.println("La vocal de la posición cuatro del arreglo vocales es: " + Vocales[4]);
        System.out.println("La respuesta a tiene auto de la posición tres del arreglo TieneAuto es: " + TieneAuto[3]);

        // Mostrar todos los elementos del arreglo "Nombres", se recorrerá el arreglo con el ciclo for.
        for (int i = 0; i < Nombres.length; i++)
        {
            // El método length hace referencia a tamaño del arreglo es decir a 3.
            // Es mas eficiente utilizar este método ya que no se cometen errores en el tamaño del arreglo que hay que 
            // recordar que el tamaño del arreglo es 3 pero inicia su recorrido en la posición 0 y termina en n - 1,
            // que es el tamaño del arreglo es decir termina en la posición 2.
            System.out.println("El nombre de la posicion " + i + " es: " + Nombres [i]); // Muestra la posición del arreglo con la variable "i" y el dato de cada posición del arreglo con "Nombres [i]".
        }
        for (int j = 0; j < Apellidos.length; j++)
        { // Se recorre el arreglo "Apellidos" con la variable subíndice "j" que inicia en 0 y termina hasta que sea menor al tamaño del arreglo.
            System.out.print("Escribe el apellido numero " + (j + 1) + ": "); // Como el arreglo inicia en cero se le sumo uno al subíndice para que muestre el numero 1 primero.
            Apellidos[j] = br.readLine(); // Se ingresan los datos al arreglo "Apellidos" cada dato según el subíndice "j".
        }
        // Se recorre el arreglo "Salario".
        for (int k = 0; k < Salario.length; k++)
        {
            System.out.print("Escribe el salario numero " + (k + 1) + ": "); // Como el arreglo inicia en cero se le sumo uno al subíndice para que muestre el numero 1 primero.
            Salario[k] = Double.parseDouble(br.readLine()); // Se ingresan los datos al arreglo Salario cada dato segun el subíndice "k".
        }
        // Se recorre el arreglo "Salario".
        for (int k = 0; k < Salario.length; k++)
        {
            Suma = Suma + Salario[k]; // Se realiza la Suma de los salarios con la variable de tipo acumulador llamada "Suma" se ira sumando cada Salario de cada posición del arreglo con el subindice "k" por ello "Salario[k]".
            
            if (Salario[k] >= 20000)
            { // Si "Salario[k]" es Mayor o igual a 20000 se sumara 1
                Alto++; // a la variable "Alto" ya que significa "Alto = Alto + 1".
            }
            else
            { // Si la condición anterior no se cumple
            if (Salario[k] < 20000)
            { // se realiza esta condición si el "Salario[k]" es menor a 20000
                Bajo++; // se Suma 1 a la variable "Bajo", es decir "Bajo = Bajo + 1".
            }
            }
        }

        System.out.println("Tamaño del arreglo Salario: " + Salario.length); // Imprime el tamaño del arreglo.
        Promedio = Suma / Salario.length; // Calcula el promedio de los salarios.
        System.out.println("El total de los salarios es: " + Suma); // Muestra el total de los salarios.
        System.out.println("El Promedio de los salarios es: " + Promedio); // Imprime el Promedio de los salarios.
        System.out.println("El total de los salarios altos es: " + Alto); // Muestra el total de los salarios altos.
        System.out.println("El total de los salarios bajos es: " + Bajo); // Muestra el total de los salarios bajos.

        // Es declarada la variable Mayor a la cual se el asigna como valor inicial el dato de la posición cero del arreglo "Salario".
        double Mayor = Salario [0];

        for (int k = 0; k < Salario.length; k++)
        { // Se recorre el arreglo "Salario".
            if (Mayor < Salario[k])
            {
                Mayor = Salario[k]; // Si la variable Mayor es menor al valor de la posición del arreglo "Salario[k]" entonces ese valor se le asigna a la variable Mayor.
            }
        }
        System.out.println("El Salario mas Alto es: " + Mayor); // Muestra el Salario mas alto.
    }
}