/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labp1_jarlinson_salgado;

import java.util.Scanner;

/**
 *
 * @author jarli
 */
public class Labp1_jarlinson_salgado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int respuesta =-1;
        Scanner read = new Scanner (System.in); 
        
        while(respuesta !=0){
            System.out.println("Menu principal :");
            System.out.println("opcion 1. mesaje");
            System.out.println("opcion 2. calculadora");
            System.out.println("opcion 3. edades ");
            respuesta = read.nextInt();
            
            if (respuesta == 1){
                System.out.println("hola soy yo");
                // opcion 2
            } else if (respuesta == 2){
                System.out.println("ingrese el nuemro uno");
                int num1 = read.nextInt();
                System.out.println("ingese el segundo nuemro");
                int num2 = read.nextInt();
                int resultado = num1 * num2;
                System.out.println("resultado:"+resultado);
                
                
            }else if (respuesta == 3){
                System.out.println("ingrese su edad :");
                int edad =read.nextInt();
                
                if (respuesta  == 3){
                System.out.println("ingrese su edad: ");
                edad = read.nextInt();
                
                if(edad>=18){
                    System.out.println("usted es mayor de edad");
                    
                }else{
                    System.out.println("usted es menor de edad");
                }
            }
                
            }
        }
    }
        // TODO code application logic here
}
    
    
