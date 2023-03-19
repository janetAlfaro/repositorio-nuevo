package Package_01;

import java.util.Scanner;

public class extra_004_chat_gpt{

    public static void main(String args[]) {

        Scanner read = new Scanner(System.in);
        String[] unidadesRomanas = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decenasRomanas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] centenasRomanas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] millaresRomanos = {"", "M", "MM", "MMM"};


        System.out.println("Ingrese un número entre 1 y 3999");
        int numero = read.nextInt();
    
        if (numero <= 0 || numero > 3999) {
            System.out.println("Número fuera de rango");
        }
    
        String unidades = unidadesRomanas[numero % 10];
        numero /= 10;
    
        String decenas = decenasRomanas[numero % 10];
        numero /= 10;
    
        String centenas = centenasRomanas[numero % 10];
        numero /= 10;
    
        String millares = millaresRomanos[numero % 10];
    
        System.out.println(millares + centenas + decenas + unidades); 

        read.close();
    }
    
    

}


