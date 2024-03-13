/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosconobjetos;

/**
 *
 * @author KEVIN (Correciones por EViasValdez)
 */

public class Persona {
    private String Nombre;
    private int Edad;
    private float Peso;

    public String GetNombre() {
        return Nombre;
    }
    public void SetNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int GetEdad() {
        return Edad;
    }
    public void SetEdad(int Edad) {
        this.Edad = Edad;
    }
    public float GetPeso() {
        return Peso;
    }
    public void SetPeso(float Peso) {
        this.Peso = Peso;
    }
    /**
     * @return the Nombre
     */
}