/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.ejemplobucleanidado;

/**
 *
 * @author melola
 */
public class EjemploBucleAnidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int base = 30;
        int altura = 10;
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
    
}
