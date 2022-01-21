/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestooo;

/**
 *
 * @author yayis
 */

//Clase llamada Producto
public class Producto {
    //atributo de la clase llamado precio de tipo float de acceso publico
    public float precio;
    //atributo de la clase llamado impuesto con un valor inicial de 0.05f de tipo float de acceso publico
    public float impuesto = 0.05f;

    //metodos get y set para los atributos
    //el metodo set significa que el valor quu se lea desde el main se le ponga al atributo Precio 
    //el metodo get significa obtener es decir el valor que se le haya asignado al atributo por medio del
    // metodo set con el metodo get se obtiene
    // todos los atributos deberan de tener estos metodos implementados
    //en esta clase no se especifico el metodo constructor
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }
    
    //metodo de  tipo floar llamadoo total de acceso publico
    // que recibe como parametros el precio y el impuesto
    // que se leyeron desde el main
    // regresa el valor de la variable total la cual muestar el resulatdo de la operacion
    public float total(float getprecio, float getimpuesto){
        float total;
        total = precio + (precio * impuesto);
        return total; 
    }
}
