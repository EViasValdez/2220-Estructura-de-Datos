/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestooo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yayis (Correcciones por EViasValdez)
 */

public class ImpuestoOO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Librerías para leer y convertir datos.
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        // Instanciamiento del objeto llamado "Prod" a la clase "Producto", es decir se esta creando un objeto.
        Producto Prod = new Producto();
        // Declaración de la variable precio de tipo float.
        float Precio;
        // Es enviado un mensaje a pantalla con el texto "Escribe el precio".
        System.out.println("Escribe el precio");
        // Es leída una linea que se convierte a un dato de tipo float con el método parseFloat el cual pertenece
        // a la clase float y se asigna a la variable "precio".
        Precio = Float.parseFloat(br.readLine());
        // Se agrega con el método set el valor del precio al atributo "precio" de la clase.
        Prod.SetPrecio(Precio);
        // Se agrega con el método set el valor del impuesto al atributo "precio" de la clase.
        Prod.SetImpuesto(Prod.Impuesto);
        // Se imprime el resultado que se esta calculando llamando al método "total", que esta en la clase el
        // cual muestra el resultado de la operación.
        // Se pasan dos atributos que son el precio y el impuesto.
        System.out.println("El total a pagar es: " + Prod.Total(Prod.GetPrecio(), Prod.GetImpuesto()));
    }
}
