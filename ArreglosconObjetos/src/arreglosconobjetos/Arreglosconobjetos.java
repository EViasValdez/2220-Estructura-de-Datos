/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosconobjetos;

import java.util.Scanner;

/**
 *
 * @author KEVIN (Correcciones por EViasValdez)
 */

public class ArreglosconObjetos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        Persona[] Pacientes = new Persona[4];
        // Se declara un arreglo de objetos llamado "Pacientes"
        // el cual esta instanciado a la Clase "Persona" de tamaño 4.
        // Cada posición del arreglo contendrá un objeto de la clase "Persona" en la posición 0
        // del arreglo se almacenara el Nombre, Edad y Peso de una persona.
        
        String Otra;
        int Opc;

        do { 
            // En el ciclo do while la instrucción do significa hacer el programa estará realizando este
            // ciclo hasta que se cumpla la condición del while.
            System.out.println("Hospital ABC");
            System.out.println("1. Ingresar datos del paciente");
            System.out.println("2. Mostrar el paciente de mayor Edad");
            System.out.println("3. Mostrar el Nombre de todos los pacientes");
            System.out.println("4. Mostrar el Nombre de todos los pacientes menores de Edad");
            System.out.println("Elige una opcion");
            Opc = leer.nextInt(); // Se lee una opción del menu de la opción 1 a la 4.
        
            switch (Opc) 
            // La instrucción switch va acompañada de casos que evalúan a la variable "Opc" dependiendo
            // de la opción que ingrese entrara al caso correspondiente.
            {
            case 1:
                for (int i = 0; i < Pacientes.length; i++)
                {
                    System.out.println("Escribe el nombre");
                    String Nombre = leer.next();
                    System.out.println("Escribe tu edad");
                    int Edad = leer.nextInt();
                    System.out.println("Escribe tu peso");
                    float Peso = leer.nextFloat();

                    // Persona pacienteTemporal = new Persona();
                    // pacienteTemporal.SetNombre (Nombre);
                    // pacienteTemporal.SetEdad (Edad);
                    // pacienteTemporal.SetPeso (Peso);
                    Pacientes[i] = new Persona(); // Crea un objeto llamado "Pacientes [i]" y se instancia a la clase "Persona"
                    Pacientes[i].SetNombre(Nombre); // Con el objeto "Pacientes [i] se manda llamar al método SetNombre para que en este
                    // se escriba el Nombre cuya variable se leyo "String Nombre = leer.next();".
                    Pacientes[i].SetEdad(Edad);
                    Pacientes[i].SetPeso(Peso);
                }
            break;

            case 2:
                System.out.println("++++++++++++++ Mostrar el Paciente mayor de Edad ++++++++++++++");
                Persona PacienteMayor;  // Crea un objeto llamado "PacienteMayor" de tipo clase "Persona"
                PacienteMayor = Pacientes[0]; // se asigna el objeto de la poción 0 del arreglo "Pacientes" al objeto PacienteMayor

                // int i = 1;
                for (int i = 0; i < Pacientes.length; i++) // Se recorre el arreglo "Pacientes".
                {
                    if (Pacientes[i].GetEdad() > PacienteMayor.GetEdad()) // Si la Edad que se obtiene el arreglo de objetos es
                    // mayor a la Edad que se obtiene en el objeto "PacienteMayor" entonces
                    {
                        PacienteMayor = Pacientes[i]; // dicha Edad se asigna al objeto "PacienteMayor".
                    }
                }
                System.out.println("El Paciente mayor de edad es: " + PacienteMayor.GetNombre());
            break;
            
            case 3:
                System.out.println("++++++++++++++ Mostrar todos los nombres de los pacientes ++++++++++++++");
                String Mostrar = "";

                for (int i = 0; i < Pacientes.length; i++)
                {
                    Mostrar = Mostrar + Pacientes[i].GetNombre() + "\n"; // Se imprime la variable Mostrar que en un inicio esta vacia pues
                } // asi se declaro y se le van agregando el Nombre de las personas de cada posición del arreglo "Personas".
                System.out.println(Mostrar);
            break;

            case 4:
                System.out.println("++++++++++++++ Pacientes menores de Edad ++++++++++++++");
                String Mostrar2 = "";

                for (int i = 0; i < Pacientes.length; i++)
                {
                    if (Pacientes[i].GetEdad() < 18) // Si la Edad que se obtiene del arreglo de objetos "Pacientes"
                        // es menor al numero 18 entonces
                    {
                    Mostrar2 = Mostrar2 + Pacientes[i].GetNombre() + "\n" + Pacientes[i].GetEdad() + "\n";
                    // se obtiene el Nombre de los pacientes su Edad que cumplan con dicha condición.
                    }
                }
                System.out.println("Los pacientes menores de Edad son: " + Mostrar2);
            break;
            }
            System.out.println("¿Deseas mostrar el menu otra vez? (Si/No)");
            Otra = leer.next();
        } while (Otra.equals("si")); // Mientras la variable "Otra" sea igual a "si" se regresa a la 
        // instrucción do e inicia el ciclo.
    }
}