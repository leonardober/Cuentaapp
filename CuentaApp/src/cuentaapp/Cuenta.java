/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaapp; //controlador

/**
 *
 * @author HP
 */
public class Cuenta {   //tiene los controles
 
    //Atributos
    private String titular;
    private double cantidad;  //personalizada para el modelo
 
    //Constructores
    public Cuenta(String titular) {
        this(titular, 0); //Sobrecarga
    }
 
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        //Si la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }
 
    //Metodos acciones funciones
    public String getTitular() { //obtener captura
        return titular;
    }
 
    public void setTitular(String titular) { //asignar  muestra o imprime
        this.titular = titular;
    }
 
    public double getCantidad() {
        return cantidad;
    }
 
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
 
    /**
     * Ingresa dinero en la cuenta, 
     * solo si es positivo la cantidad
     *
     * @param cantidad
     */
    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.cantidad += cantidad;   
        }
    }
 
    /**
     * Retira una cantidad en la cuenta, si se quedara en negativo se quedaria
     * en cero
     *
     * @param cantidad
     */
    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }
 
    /**
     * Devuelve el estado del objeto
     *
     * @return
     */
    @Override
    public String toString() {   //toma toda la informacion y muestra la impresion
        return "El titular " + titular + " tiene " + cantidad + " pesos en la cuenta";
    }
 
}