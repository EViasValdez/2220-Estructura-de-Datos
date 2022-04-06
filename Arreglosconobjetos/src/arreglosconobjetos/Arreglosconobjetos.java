/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosconobjetos;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class Arreglosconobjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        Persona [] Pacientes = new Persona [4]; // Se declara un arreglo de objetos llamado "Pacientes"
        // el cual esta instanciado a la Clase Persona de tamaño 4.
        // Cada posicion del arreglo contendra un objeto de la clase "persona"
        // en la posicion 0 del arreglo se almacenara el nombre, edad y peso de una persona.
        
        String otra;
        int opc;

        do { // Ciclo do while la instruccion do significa hacer el programa estara realizando este
            // ciclo hasta que se cumpla la condicion del while.
            System.out.println("Hospital ABC");
            System.out.println("1. Ingresar datos del paciente");
            System.out.println("2. Mostrar el paciente de mayor edad");
            System.out.println("3. Mostrar el nombre de todos los pacientes");
            System.out.println("4. Mostrar el nombre de todos los pacientes menores de edad");
            System.out.println("Elige una opcion");
            opc = leer.nextInt();  // Se lee una opcion del menu de la opcion 1 a la 4.
        
            switch (opc) 
                // Instruccion switch la cual va a compañada de casos
                // evalua a la variable opc dependiendo de la opcion que aqui se ingrese 
                // entrara al caso correspondiente caso 1, caso 2, caso 3, o caso 4.
            {
            case 1:     
                for (int i = 0; i < Pacientes.length; i++)
                {
                    System.out.println("Escribe el nombre: ");
                    String nombre = leer.next();
                    System.out.println("Escribe tu edad: ");
                    int edad = leer.nextInt();
                    System.out.println("Escribe tu peso: ");
                    float peso = leer.nextFloat();

                    // Persona pacienteTemporal = new Persona();
                    // pacienteTemporal.setNombre (nombre);
                    // pacienteTemporal.setEdad (edad);
                    // pacienteTemporal.setPeso (peso);
                    Pacientes [i] = new Persona(); // Crea un objeto llamado "Pacientes [i] y se instancas a la clase "Persona"
                    Pacientes [i].setNombre (nombre); // Con el objeto "Pacientes [i] se manda llamar al metodo setNombre para que en este
                    // se escriba el nombre cuya variable se leyo "String nombre = leer.next();".
                    Pacientes [i].setEdad (edad);
                    Pacientes [i].setPeso (peso);
                }
            break;

            case 2:
                System.out.println("++++++++++++++ Mostrar el Paciente de mayor edad ++++++++++++++");
                Persona pacientemayor;  // Crea un objeto llamado "pacientemayor" de tipo clase "Persona"
                pacientemayor = Pacientes [0]; // se asigna el objeto de la pocion 0 del arreglo Pacientes al objeto pacientemayor

                // int i = 1;
                for (int i = 0; i < Pacientes.length; i++) // Se recorre el arreglo Pacientes.
                {
                    if (Pacientes [i].getEdad() > pacientemayor.getEdad()) // Si la edad que se obtiene el arreglo de objetos es
                    // mayor a la edad que se obtiene en el objeto "pacientemayor" entonces
                    {
                        pacientemayor = Pacientes [i]; // dicha edad se asigna al objeto "pacientemayor".
                    }
                }
                System.out.println("El Paciente de mayor edad es: " + pacientemayor.getNombre());
            break;
            
            case 3:
                System.out.println("++++++++++++++ Mostrar todos los nombres de los pacientes ++++++++++++++");
                String mostrar = "";
                for (int i = 0; i < Pacientes.length; i++)
                {
                    mostrar = mostrar + Pacientes [i].getNombre() + "\n"; // Se imprime la variable mostrar que en un
                } // inicio esta vacia pues asi se declaro y se le van a gregando el nombre de las personas de cada posicion del arreglo "Personas".
                System.out.println(mostrar);
            break;

            case 4:
                System.out.println("++++++++++++++ Pacientes menores de edad ++++++++++++++");
                String mostrar2 = "";

                for (int i = 0; i < Pacientes.length; i++)
                {
                    if (Pacientes [i].getEdad() < 18) // Si la edad que se obtiene del arreglo de objetos Pacientes
                        // es menor al numero 18 entonces
                    {
                    mostrar2 = mostrar2 + Pacientes [i].getNombre() + "\n" + Pacientes [i].getEdad() + "\n";
                    // se obtiene el nombre de los pacientes su edad que cumplan con dicha condicion.
                    }
                }
                System.out.println("Los pacientes menores de edad son: " + mostrar2);
            break;

    }
            System.out.println("¿Deseas mostrar el menu otra vez? (Si/No");
            otra = leer.next();
        } while (otra.equals("si")); // Mientras la variable otra sea igual a "si" se regresa a la 
        // instruccion do e incia el ciclo.
        }
    }