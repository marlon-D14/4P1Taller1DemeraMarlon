/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4p1taller1demeramarlon;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner reader = new Scanner (System.in);
         System.out.print("****************************************\n");
         System.out.print("UNIVERSIDAD DE LAS FUERZAS ARMADAS-ESPE\n");
         System.out.print("Nombre: Marlon Demera\n");
         System.out.print("Docente: Veronica Martinez\n");
         System.out.print("Fecha: 10/11/2023\n");
         System.out.print("Tema: Taller 1 \n");
         System.out.print("*****************************************\n");
        System.out.print( "Ingrese el primer numero: \n");
        int num1= reader.nextInt();
        System.out.print( "Ingrese el segundo numero:\n");
        int num2= reader.nextInt();
        int suma=num1+num2;
        int resta=num1-num2;
        int multi=num1*num2;
        int div=num1/num2;
        
        System.out.println("La suma de "+ num1 + " y " + num2 + " Es: " + suma);
        System.out.println("La resta de "+ num1 + " y " + num2 + " Es: " + resta);
        System.out.println("La multiplicacion de "+ num1 + " y " + num2 + " Es: " + multi);
        System.out.println("La division de "+ num1 + " y " + num2 + " Es: " + div);
        
        // TODO code application logic here
    }
    
}
