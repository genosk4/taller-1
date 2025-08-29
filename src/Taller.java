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
            ejecutarOpcion(opcion, in);


        } while (opcion != 5);
        in.close();
    }

    public static int leerOpcion(Scanner in) {
        System.out.println("Seleccione una opcion: ");
        return in.nextInt();
    }

    public static void ejecutarOpcion(int opcion, Scanner in) {
        in.nextLine();
        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese una frase: ");
                String texto = in.nextLine();
                boolean resultado = esRevesDerecho(texto);
                System.out.println("¿La frase es Revés-Derecho? " + (resultado ? "Sí" : "No"));
            }
            case 2 -> {
                System.out.print("Ingrese una frase: ");
                String texto = in.nextLine();
                int vocales = contarVocales(texto);
                System.out.println("La frase tiene " + vocales + " vocales.");
            }
            case 3 -> {
                System.out.print("Ingrese una frase a encriptar: ");
                String texto = in.nextLine();
                String encriptado = encriptarTexto(texto);
                System.out.println("Frase encriptada: " + encriptado);
            }
            case 4 -> {
                System.out.print("Ingrese una frase a desencriptar: ");
                String texto = in.nextLine();
                String desencriptado = desencriptarTexto(texto);
                System.out.println("Frase desencriptada: " + desencriptado);
            }
            case 5 -> {
                System.out.println("Saliendo");
            }
            default -> {
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 5.");
            }
        }
    }


    public static void mostrarMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1.- Verficar si una frase es Reves-Derecho");
        System.out.println("2.- Contar vocales en una frase");
        System.out.println("3.- Encriptar una frase");
        System.out.println("4.- Desencriptar una frase");
        System.out.println("5.- Salir");
    }


    public static boolean esRevesDerecho(String texto) {
        if (texto == null || texto.isEmpty()) {
            return true;
        }
        String textoLimpio = texto.replaceAll("\\s+", "").toLowerCase();

        String textoInvertido = new StringBuilder(textoLimpio).reverse().toString();

        return textoLimpio.equals(textoInvertido);

    }

    public static int contarVocales(String texto) {
        if (texto == null) {
            return 0;
        }

        int contador = 0;
        String textoMinuscula = texto.toLowerCase();

        for (char c : textoMinuscula.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static String encriptarTexto(String texto) {
        if (texto == null) {
            return null;
        }
        return texto.replace("a", "@")
                .replace("e", "&")
                .replace("i", "!")
                .replace("o", "*")
                .replace("u", "#")
                .replace("A", "@")
                .replace("E", "&")
                .replace("I", "!")
                .replace("O", "*")
                .replace("U", "#");
    }

    public static String desencriptarTexto(String texto) {

        if (texto == null) {
            return null;
        }
        return texto.replace("@", "a")
                .replace("&", "e")
                .replace("!", "i")
                .replace("*", "o")
                .replace("#", "u");
    }
}