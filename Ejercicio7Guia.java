/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio7Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner leer = new Scanner(System.in);
        int correctos = 0;
        int incorrectos = 0;
        while (true) {
            System.out.print("Ingrese una secuencia: ");
            String secuencia = leer.nextLine();
            if (secuencia.equals("&&&&&")) {
                break;
            } else if (secuencia.length() == 5 && secuencia.substring(0,1).equalsIgnoreCase ("x") && secuencia.substring(4,5).equalsIgnoreCase("o")) {
                correctos++;
            } else {
                incorrectos++;
            }
        }
        System.out.println("Informe:");
        System.out.println("Secuencias correctas: " + correctos);
        System.out.println("Secuencias incorrectas: " + incorrectos);
    }
}