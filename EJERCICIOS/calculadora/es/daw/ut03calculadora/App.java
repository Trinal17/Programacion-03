/*
 * https://github.com/profeMelola/Programacion-03-2023-24/tree/main/EJERCICIOS/calculadora
 */
package es.daw.ut03calculadora;

/**
 *
 * @author melola
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // NUESTRAS PRIMERAS FUNCIONES O MÉTODOS ESTÁTICOS
        pintaTitulo();
        
        pintaMenu();
        

    }
    
    public static void pintaTitulo(){
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
    
    public static void pintaMenu(){
        System.out.println("\033[35m ***** MENÚ ******");
        System.out.println("\033[34m 1. Sumar");
        System.out.println("\033[34m 1. Restar");
        System.out.println("\033[34m 1. Multiplicar");
        System.out.println("\033[34m 4. Dividir");
        System.out.println("\033[34m 5. Resto");
        System.out.println("\033[34m 0. Salir del programa");
        
    }

}
