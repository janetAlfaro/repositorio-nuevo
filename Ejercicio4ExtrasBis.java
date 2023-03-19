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
public class Ejercicio4ExtrasBis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 int numero;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número arábigo: ");
        numero = leer.nextInt();
        
        if(numero < 1 || numero > 3999) {
            System.out.println("El número ingresado debe estar entre 1 y 3999.");
        } else {
            String resultado = "";
            
            // Mientras el número sea mayor a 0, seguimos dividiéndolo
            while(numero > 0) {
                if(numero >= 1000) {
                    resultado += "M";
                    numero -= 1000;
                } else if(numero >= 900) {
                    resultado += "CM";
                    numero -= 900;
                } else if(numero >= 500) {
                    resultado += "D";
                    numero -= 500;
                } else if(numero >= 400) {
                    resultado += "CD";
                    numero -= 400;
                } else if(numero >= 100) {
                    resultado += "C";
                    numero -= 100;
                } else if(numero >= 90) {
                    resultado += "XC";
                    numero -= 90;
                } else if(numero >= 50) {
                    resultado += "L";
                    numero -= 50;
                } else if(numero >= 40) {
                    resultado += "XL";
                    numero -= 40;
                } else if(numero >= 10) {
                    resultado += "X";
                    numero -= 10;
                } else if(numero >= 9) {
                    resultado += "IX";
                    numero -= 9;
                } else if(numero >= 5) {
                    resultado += "V";
                    numero -= 5;
                } else if(numero >= 4) {
                    resultado += "IV";
                    numero -= 4;
                } else if(numero >= 1) {
                    resultado += "I";
                    numero -= 1;
                }
            }
            
            System.out.println("El número arábigo en números romanos es: " + resultado);
        }
    }
}