/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.ut03calculadora;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class App {

    // de ámbito global para poder utilizarlo en cualquier parte del program
    static Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables 
        int opcion;
        int operando1, operando2, resultado = 0;
        
        pintaTitulo();
        
        opcion = gestionarMenu();
        
        if (opcion ==0 ){
            System.out.println("Vas a salir de la calculadora");
        }else{
            
            System.out.println("Escribe el valor del operando 1:");
            operando1 = sc.nextInt();
            
            System.out.println("Escribe el valor del operando 2:");
            operando2 = sc.nextInt();
            
            
            // Depediendo de la opción se ejecutará una función u otra
            switch (opcion) {
                case 1:
                    resultado = sumar(operando1,operando2);
                    break;
                default:
                    System.out.println("Has elegido una opción incorrecta!!!");
            }
            
            System.out.println("El resultado es :"+resultado);
        }
    }

    public static void pintaTitulo() {
        System.out.println("    __   ____  _        __  __ __  _       ____  ___     ___   ____    ____ \n"
                + "   /  ] /    || |      /  ]|  |  || |     /    ||   \\   /   \\ |    \\  /    |\n"
                + "  /  / |  o  || |     /  / |  |  || |    |  o  ||    \\ |     ||  D  )|  o  |\n"
                + " /  /  |     || |___ /  /  |  |  || |___ |     ||  D  ||  O  ||    / |     |\n"
                + "/   \\_ |  _  ||     /   \\_ |  :  ||     ||  _  ||     ||     ||    \\ |  _  |\n"
                + "\\     ||  |  ||     \\     ||     ||     ||  |  ||     ||     ||  .  \\|  |  |\n"
                + " \\____||__|__||_____|\\____| \\__,_||_____||__|__||_____| \\___/ |__|\\_||__|__|\n"
                + "                                                                            \n"
                + "");
    }

    /**
     * Método que muestra el menú de la calculadora y devuelve la opción elegida por el usuario
     * @return opción elegida por el usuario
     */
    public static int gestionarMenu() {
        System.out.println("\033[35m ***** MENÚ ******");
        System.out.println("\033[34m 1. Sumar");
        System.out.println("\033[34m 2. Restar");
        System.out.println("\033[34m 3. Multiplicar");
        System.out.println("\033[34m 4. Dividir");
        System.out.println("\033[34m 5. Resto");
        System.out.println("\033[34m 0. Salir del programa");
        System.out.println("******************************");
        System.out.println("Introduce una opción:");
        
        /*int opcion = sc.nextInt();
        return opcion;*/
        
        return sc.nextInt();

    }
    
    /**
     * Método que realiza la suma de dos operandos
     * @param op1
     * @param op2
     * @return 
     */
    public static int sumar(int op1, int op2){
        return op1+op2;        
    }



}
