/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentaapp;

/**
 *
 * @author HP
 */
public class CuentaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta_1 = new Cuenta("Juan Gonzalez");
        Cuenta cuenta_2 = new Cuenta("Fernando Rojas");
         
        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(500.000);  //metodo
        cuenta_2.ingresar(400.000);
         
        //Retiramos dinero en las cuentas
        cuenta_1.retirar(400.000);
        cuenta_2.retirar(100.000);
         
        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); 
        System.out.println(cuenta_2); 
         
    }
    
}
