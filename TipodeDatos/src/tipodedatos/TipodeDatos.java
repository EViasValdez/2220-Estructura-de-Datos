/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipodedatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Eduardo
 */

public class TipodeDatos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

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