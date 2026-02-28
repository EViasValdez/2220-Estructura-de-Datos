/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestooo;

/**
 *
 * @author yayis (Correcciones por EViasValdez)
 */

// La clase se llama "Producto".
public class Producto {
    // Atributo de la clase llamado "Precio" de tipo float de acceso publico.
    public float Precio;
    // Atributo de la clase llamado "Impuesto" con un valor inicial de 0.05f de tipo float de acceso publico.
    public float Impuesto = 0.05f;
    // Métodos get y set para los atributos.
    // El método set significa que el valor que se lea desde el main se le ponga al atributo "Precio".
    // También significa obtener es decir el valor que se le haya asignado al atributo por medio del
    // método set con el método get es obtenido.
    // Todos los atributos deberán de tener estos métodos implementados.
    // En esta clase no se especifico el método constructor.
    public float GetPrecio() {
        return Precio;
    }
    public void SetPrecio(float Precio) {
        this.Precio = Precio;
    }
    public float GetImpuesto() {
        return Impuesto;
    }
    public void SetImpuesto(float Impuesto) {
        this.Impuesto = Impuesto;
    }
    // Metodo de tipo float llamado  Total" de acceso publico que recibe
    // como parametros el precio, el impuesto y que se leyeron desde el main.
    // Regresa el valor de la variable  Total" la cual muestra el resultado de la operacion.
    public float Total(float Getprecio, float Getimpuesto) {
        float Total;

        Total = Precio + (Precio * Impuesto);
        return Total; 
    }
}