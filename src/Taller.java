import java.util.Scanner;



public class Taller {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner in = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion(in);

        } while (opcion != 3);
        in.close();
    }

    public static int leerOpcion(Scanner in) {
        return in.nextInt();
    }

    public static void mostrarMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1.- Verficar si una frase es Reves-Derecho");
        System.out.println("2.- Contar vocales en una frase");
        System.out.println("3.- Encriptar una frase");
        System.out.println("4.- Desencriptar una frase");
        System.out.println("5.- Salir");
    }
    public void leerPalabra(Scanner in) {

    }







}

