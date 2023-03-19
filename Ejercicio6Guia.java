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
public class Ejercicio6Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que pida dos números enteros positivos por teclado 
        //y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
        //y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
        //El programa deberá ejecutarse hasta que se elija la opción 5. 
        //Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
        //se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
        //Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

    Scanner leer= new Scanner(System.in);
     int num1,num2,opc,suma,resta,mult;
       
        
    do{    
    System.out.println("Ingrese dos numeros enteros positivos");
        num1=leer.nextInt();
        num2=leer.nextInt();
        suma=num1+num2;
        resta=num1-num2;
        mult=num1*num2;
        System.out.println("\n             MENU"
                +"\n1.Sumar " 
                +"\n2.Restar"
                +"\n3.Multiplicar"
                +"\n4.Dividir"
                +"\n5.Salir"
                +"\n Elija una opción:");
        opc=leer.nextInt();
    switch (opc){
        case 1: System.out.println("La suma de ambos numeros es: "+ suma);
        break;
        case 2: System.out.println("La resta de ambos numeros es: "+ resta);
        break;
        case 3: System.out.println("La multiplicacion de ambos numeros es: "+ mult);
        break;
        case 4: System.out.println("La division de ambos numeros es: "+((double) num1/num2));
        break;
        case 5: 
        System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    leer.nextLine(); // Limpiar buffer
                    String confirmacion = leer.nextLine();
                    if (confirmacion.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo del programa...");
                        break;
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (true);
    }
}

    


           



    
    
   
    
    
    



    
    
    
   
    horas = (minutos % 1440) / 60;
minutosRestantes = minutos % 60;
Augusto Campeggi 18:06
if (letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
            System.out.println("La letra ingresada es una vocal");
    
                
