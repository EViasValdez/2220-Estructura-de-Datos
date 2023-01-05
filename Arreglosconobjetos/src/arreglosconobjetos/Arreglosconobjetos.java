/*
 * To change this template, choose Tools | Templates
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
        Scanner Leer = new Scanner(System.in);

        Persona [] Pacientes = new Persona [4]; // Se declara un arreglo de objetos llamado "Pacientes"
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
            Opc = Leer.nextInt(); // Se lee una opción del menu de la opción 1 a la 4.
        
            switch (Opc) 
            // La instrucción switch va acompañada de casos que evalúan a la variable "Opc" dependiendo
            // de la opción que ingrese entrara al caso correspondiente.
            {
            case 1:
                for (int i = 0; i < Pacientes.length; i++)
                {
                    System.out.println("Escribe el nombre");
                    String Nombre = Leer.next();
                    System.out.println("Escribe tu edad");
                    int Edad = Leer.nextInt();
                    System.out.println("Escribe tu peso");
                    float Peso = Leer.nextFloat();

                    // Persona pacienteTemporal = new Persona();
                    // pacienteTemporal.setNombre (Nombre);
                    // pacienteTemporal.setEdad (Edad);
                    // pacienteTemporal.setPeso (Peso);
                    Pacientes [i] = new Persona(); // Crea un objeto llamado "Pacientes [i]" y se instancia a la clase "Persona"
                    Pacientes [i].setNombre (Nombre); // Con el objeto "Pacientes [i] se manda llamar al método setNombre para que en este
                    // se escriba el Nombre cuya variable se leyó "String Nombre = Leer.next();".
                    Pacientes [i].setEdad (Edad);
                    Pacientes [i].setPeso (Peso);
                }
            break;

            case 2:
                System.out.println("++++++++++++++ Mostrar el Paciente mayor de Edad ++++++++++++++");
                Persona PacienteMayor;  // Crea un objeto llamado "PacienteMayor" de tipo clase "Persona"
                PacienteMayor = Pacientes [0]; // se asigna el objeto de la poción 0 del arreglo "Pacientes" al objeto PacienteMayor

                // int i = 1;
                for (int i = 0; i < Pacientes.length; i++) // Se recorre el arreglo "Pacientes".
                {
                    if (Pacientes [i].getEdad() > PacienteMayor.getEdad()) // Si la Edad que se obtiene el arreglo de objetos es
                    // mayor a la Edad que se obtiene en el objeto "PacienteMayor" entonces
                    {
                        PacienteMayor = Pacientes [i]; // dicha Edad se asigna al objeto "PacienteMayor".
                    }
                }
                System.out.println("El Paciente mayor de edad es: " + PacienteMayor.getNombre());
            break;
            
            case 3:
                System.out.println("++++++++++++++ Mostrar todos los nombres de los pacientes ++++++++++++++");
                String Mostrar = "";

                for (int i = 0; i < Pacientes.length; i++)
                {
                    Mostrar = Mostrar + Pacientes [i].getNombre() + "\n"; // Se imprime la variable Mostrar que en un inicio esta vacia pues
                } // asi se declaro y se le van agregando el Nombre de las personas de cada posición del arreglo "Personas".
                System.out.println(Mostrar);
            break;

            case 4:
                System.out.println("++++++++++++++ Pacientes menores de Edad ++++++++++++++");
                String Mostrar2 = "";

                for (int i = 0; i < Pacientes.length; i++)
                {
                    if (Pacientes [i].getEdad() < 18) // Si la Edad que se obtiene del arreglo de objetos "Pacientes"
                        // es menor al numero 18 entonces
                    {
                    Mostrar2 = Mostrar2 + Pacientes [i].getNombre() + "\n" + Pacientes [i].getEdad() + "\n";
                    // se obtiene el Nombre de los pacientes su Edad que cumplan con dicha condición.
                    }
                }
                System.out.println("Los pacientes menores de Edad son: " + Mostrar2);
            break;
            }
            System.out.println("¿Deseas mostrar el menu Otra vez? (Si/No)");
            Otra = Leer.next();
        } while (Otra.equals("si")); // Mientras la variable Otra sea igual a "si" se regresa a la 
        // instrucción do e inicia el ciclo.
    }
}