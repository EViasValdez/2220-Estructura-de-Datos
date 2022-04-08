/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ALUMNOS
 */
public class EjercicioListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        
        List <Float> calificaciones = new ArrayList<Float>();
        
        int numecalf, opcion, aprueba = 0;
        float calif, eliminarcalificacion, promedio, suma = 0;
        String regresar = "si";
        
        while (regresar.equals("si")){
            System.out.println("1. Ingresar en una lista N calificaciones");
            System.out.println("2. Mostrar la lista de las calificiaciones");
            System.out.println("3. Eliminar un elemento a la lista que el usuario indique y en la opcion que indique");
            System.out.println("4. Mostrar las calificaciones de forma ascendente");
            System.out.println("5. Mostrar las calificaciones de forma decendente");
            System.out.println("6. Mostrar aquellas calificaciones aprobadas y cuantas son (aprobadas mayor o igual a 7)");
            System.out.println("7. Calcular el promedio de las calificaciones utilizando el metodo size");
            System.out.println("8. Agregar otras 5 calificaciones");
            System.out.println("9. Mostrar los elementos de las listas desde la pocicion 5 a la 10");
            System.out.println("10. Limpiar la lista");
            System.out.println("Eliga una opcion");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion){
            case 1:
                System.out.println("Inserte numero de calificaciones");
                numecalf = Integer.parseInt(br.readLine());

                for (int i = 0; i <= numecalf - 1; i++)
                {
                    System.out.println("Inserte la calificacion");
                    calif = Float.parseFloat(br.readLine());
                    calificaciones.add (calif);
                    System.out.println("La calificacion agregada es: " + calificaciones);
                }
            break;

            case 2:
                System.out.println("La calificacion agregada es: " + calificaciones);
            break;

            case 3:
                System.out.println("Eliga la calificacion a eliminar");
                eliminarcalificacion = Float.parseFloat(br.readLine());
                calificaciones.remove (eliminarcalificacion);
            break;

            case 4:
                calificaciones.sort (null);
                System.out.println(calificaciones);
            break;
            
            case 5:
                Collections.sort (calificaciones, Collections.reverseOrder());
                System.out.println(calificaciones);
            break;

            case 6:
                for (int i = 0; i <= calificaciones.size() - 1; i++) 
                {
                    if (calificaciones.get (i) >= 7)
                    {
                        aprueba = aprueba + 1;
                    }
                }
            System.out.println("Total de calificaiones aprobadas: " + aprueba);
            break;

            case 7:
                for (int i = 0; i <= calificaciones.size() - 1; i++)
                {
                    suma = suma + calificaciones.get (i);
                }
                promedio = suma / calificaciones.size();
                System.out.println("El promedio es: " + promedio);
            break;
        
            case 8:
                for (int i = 0; i <= 4; i++)
                {
                    System.out.println("Inserte la calificacion");
                    calif = Float.parseFloat(br.readLine());
                    calificaciones.add (calif);
                    System.out.println("La calificacion agregada es: " + calificaciones);
                }
            break;
        
            case 9:
                System.out.println(calificaciones.subList(0, 5));
            break;
        
            case 10:
                calificaciones.clear();
                System.out.println(calificaciones);
            break;

        }
        System.out.println("¿Quiere mostrar el menu otra vez?");
        regresar = br.readLine();
        }
    }
}