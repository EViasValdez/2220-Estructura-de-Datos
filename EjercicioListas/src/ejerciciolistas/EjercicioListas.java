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
 * @author EViasValdez
 */

public class EjercicioListas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        List <Float> Calificaciones = new ArrayList<Float>();

        int NumeCalf, Opcion, Aprueba = 0;
        float Calif, EliminarCalificacion, Promedio, Suma = 0;
        String Regresar = "si";

        while (Regresar.equals("si"))
        {
            System.out.println("1. Ingresar en una lista N calificaciones");
            System.out.println("2. Mostrar la lista de las calificaciones");
            System.out.println("3. Eliminar un elemento a la lista que el usuario indique y en la opción que indique");
            System.out.println("4. Mostrar las calificaciones de forma ascendente");
            System.out.println("5. Mostrar las calificaciones de forma descendente");
            System.out.println("6. Mostrar aquellas calificaciones aprobadas y cuantas son (aprobadas mayor o igual a 7)");
            System.out.println("7. Calcular el promedio de las calificaciones utilizando el método size");
            System.out.println("8. Agregar otras 5 calificaciones");
            System.out.println("9. Mostrar los elementos de las listas desde la posición 5 a la 10");
            System.out.println("10. Limpiar la lista");
            System.out.println("Elige una opción");
            Opcion = Integer.parseInt(br.readLine());

            switch (Opcion)
            {
            case 1:
                System.out.println("Inserte numero de calificaciones");
                NumeCalf = Integer.parseInt(br.readLine());

                for (int i = 0; i <= NumeCalf - 1; i++)
                {
                    System.out.println("Inserte la calificación");
                    Calif = Float.parseFloat(br.readLine());
                    Calificaciones.add(Calif);
                    System.out.println("La calificación agregada es: " + Calificaciones);
                }
            break;

            case 2:
                System.out.println("La calificación agregada es: " + Calificaciones);
            break;

            case 3:
                System.out.println("Elige la calificación a eliminar");
                EliminarCalificacion = Float.parseFloat(br.readLine());
                Calificaciones.remove(EliminarCalificacion);
            break;

            case 4:
                Calificaciones.sort(null);
                System.out.println(Calificaciones);
            break;
            
            case 5:
                Collections.sort(Calificaciones, Collections.reverseOrder());
                System.out.println(Calificaciones);
            break;

            case 6:
                for (int i = 0; i <= Calificaciones.size() - 1; i++) 
                {
                    if (Calificaciones.get(i) >= 7)
                    {
                        Aprueba = Aprueba + 1;
                    }
                }
            System.out.println("Total de calificaciones aprobadas: " + Aprueba);
            break;

            case 7:
                for (int i = 0; i <= Calificaciones.size() - 1; i++)
                {
                    Suma = Suma + Calificaciones.get(i);
                }
                Promedio = Suma / Calificaciones.size();
                System.out.println("El promedio es: " + Promedio);
            break;
        
            case 8:
                for (int i = 0; i <= 4; i++)
                {
                    System.out.println("Inserte la calificación");
                    Calif = Float.parseFloat(br.readLine());
                    Calificaciones.add(Calif);
                    System.out.println("La calificación agregada es: " + Calificaciones);
                }
            break;
        
            case 9:
                System.out.println(Calificaciones.subList(0, 5));
            break;
        
            case 10:
                Calificaciones.clear();
                System.out.println(Calificaciones);
            break;

            }
        System.out.println("¿Quiere mostrar el menu otra vez?");
        Regresar = br.readLine();
        }
    }
}