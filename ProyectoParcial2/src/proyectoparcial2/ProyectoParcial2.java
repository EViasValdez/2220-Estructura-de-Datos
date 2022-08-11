/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparcial2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author EViasValdez
 */
public class ProyectoParcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr); // Permite agregar el br.readline en el Integer.
        
        Queue <Integer> deposito = new LinkedList<>(); // Es donde se crea la cola.
        
        int litros; // La variable de los litros en entero es declarada aqui.
        float porcentaje; // Se declara el porcentaje en flotante.
        float resultado; // Aqui es similar al porcentaje pero con el resultado.
        
        System.out.println("El tanque tiene estos litros");
        System.out.println(deposito); // Se muestran los litros disponibles.
        
        System.out.println("Pulse enter para continuar");
        br.readLine(); // Espera a la lectura de datos.
        
        System.out.println("¿Cuantos litros desea meter?");
        litros = Integer.parseInt(br.readLine()); // Se ingresa la cantidad de litros a colocar.
        
        for (int i = 18; i <= litros; i++) // El for se utiliza para ingresar la cantidad de litros en el deposito.
        {
            System.out.println("Usted ha ingresado " + litros + " litros");
            deposito.add (i);
        }
        
        System.out.println("El tanque tiene estos litros");
        System.out.println(deposito); // Se muestran los litros ingresados.
        
        System.out.println("Pulse enter para continuar");
        br.readLine();
        
        System.out.println("Garrafon");
        int garraf = deposito.remove(); // Se depositan los litros de agua del deposito en el garrafon.

        System.out.println("Se han vaciado " + garraf + " litros"); // Se muestra los litros que se vaciaron.
        
        System.out.println("Ahora quedan");
        System.out.println(deposito); // Se muestra los litros que quedaron.
        
        System.out.println("En porcentaje");
        porcentaje = ((litros - garraf) * 100) / litros; // Calculo de los litros que quedaron para pasarlos a porcentaje.
        System.out.println("El porcentaje es: " + porcentaje + "%"); // Muestran los litros a porcentaje.
    }
}