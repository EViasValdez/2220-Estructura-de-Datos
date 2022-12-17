/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodedatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */
public class Tipodedatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        String Nombre;
        char Grupo;
        float Promedio;

        System.out.println("Escribe tu nombre");
        Nombre = br.readLine();

        System.out.println("Escribe tu grupo");
        Grupo = (char)br.read();

        System.out.println("Escribe tu promedio");
        Promedio = Float.parseFloat(br.readLine());
    }
}