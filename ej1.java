
package com.example;


import java.util.Scanner; //PONER EN TODOS LOS SCRIPTS 


public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Crear el scanner PONER EN TODOS LOS SCRIPTS
        int num1 = 0;
        int num2 = 0;                          
        System.out.println ("Dime el primer numero"); //pirintln para que lo ponga en una nueva linea
        num1 = sc.nextInt(); //Esto es el "leer"
        System.out.println ("Dime el segundo numero");
        num2 = sc.nextInt();
        if (num1==num2) { //<- eso es el hacer 
            System.out.println ("Los numeros son iguales");    
        }
        else //esto es el SiNo
            if (num1>num2) {
                System.out.println ("El primer numero es mayor que el segundo");
            }
            else 
                System.out.println ("El segundo numero es mayor que el primero");
        
    }
}