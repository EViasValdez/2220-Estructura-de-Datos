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
 * @author yayis
 */
public class ImpuestoOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Librerias para leer y convertir datos
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //SE instancia el objeto llamado prod a la clase Producto, es decir se esta creando un objeto
        Producto prod = new Producto();
        //se declara la variable precio de tipo float
        float precio;
        // se envia un mensaje a pantalla con la leyenda Escribe el Precio
        System.out.println("Escribe el Precio");
        // Se lee una linea que se convierte a un dato de tipo float con el metodo 
        //parseFloat el cual pertenece a la clase Float y se asigna a la variable precio.
        precio = Float.parseFloat(br.readLine());
        //Se le pone con el metodo set el valor del precio al atributo precio de la clase
        prod.setPrecio(precio);
        //Se le pone con el metodo set el valor del impuesto al atributo precio de la clase
        prod.setImpuesto(prod.impuesto);
        //Se imrpime el resultado que se esta calculando llamando al metodo total
        // que esta en la clase el cual muestra el resultado de la operacion
        //se le pasan dos atrbutos el precio y el Impuesto
        System.out.println("El total a pagar es:  "  + prod.total(prod.getPrecio(), prod.getImpuesto()));
    }
}
