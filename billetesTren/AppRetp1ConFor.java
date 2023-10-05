/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/billetesTren#escribir-el-programa-que-tenga-en-cuenta-las-siguientes-especificaciones
 */
package es.daw.billetestren;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class AppReto1ConFor {

    // ÁMBITO GLOBAL A LA CLASE
    static final int PRECIO_BILLETE = 3;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarando variables
        // VARIABLES DE ÁMBITO AL MÉTODO MAIN
        int edad = 0;
        double precioFinalBillete = 0;
        

        // El scanner lo declaro fuera del bucle
        Scanner sc = new Scanner(System.in);
        
        int limite = 5;

        for(int i = 1; i <= limite; i++){
        
            System.out.println("*************************");
            System.out.println("* Billete número <"+i+">");
            
            if ( i == limite){
                System.out.println("Qué suerte, promoción especial!!!!");
                precioFinalBillete = 0;
            }else{
            
                //Pedir la edad al usuario
                System.out.print("Introduce tu edad: ");
                edad = sc.nextInt();

                if (edad >= 8 && edad <= 17) {
                    // mitad del billete
                    precioFinalBillete = PRECIO_BILLETE * 0.5;
                } else if (edad >= 18 && edad <= 64) {
                    precioFinalBillete = PRECIO_BILLETE;
                }
            }
            
            System.out.println("El precio final de tu billete es: " + precioFinalBillete);        
        }// end for
        
    }
    
}
