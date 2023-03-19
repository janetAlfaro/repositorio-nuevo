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
public class Ejercicio4Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10:");
        int num;
        num=leer.nextInt();
        
        switch (num){
            case 1: System.out.println("El numero en Romanos es: I");
            break;
            case 2: System.out.println("El numero en Romanos es: II");
            break;
            case 3: System.out.println("El numero en Romanos es: III");
            break;
            case 4: System.out.println("El numero en Romanos es: IV");
            break;
            case 5: System.out.println("El numero en Romanos es: V");
            break;
            case 6: System.out.println("El numero en Romanos es: VI");
            break;
            case 7: System.out.println("El numero en Romanos es: VII");
            break;
            case 8: System.out.println("El numero en Romanos es: VIII");
            break;
            case 9: System.out.println("El numero en Romanos es: IX");
            break;
            case 10: System.out.println("El numero en Romanos es: X");
            break;
            default:
                System.out.println("El numero ingresado no es correcto");
        } 
        
    }
    
}
