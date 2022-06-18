//Nombre: Luciano Ezequiel Galván
//Legajo: VINF012232
//DNI: 35.089.500
//Fecha: 02/06/2022

import java.util.Scanner;

public class Exc2Consigna3 {

    public static void main(String[] args) {

        String[] palabras = new String[10];
        Scanner teclado = new Scanner(System.in);

        //Leer las palabras del usuario
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("\nIngrese una palabra (por favor, sólo letras): ");
            String palabra = teclado.nextLine();
            palabra = palabra.toUpperCase(); // Convierte a mayuscula el String

            palabras[i] = palabra; // Guarda el String

            if((9 - i) > 0) {
                System.out.print("Quedan " + (9 - i) + " espacios. " + "Desea ingresar otra palabra? (S/N) :");
                String opcion = teclado.nextLine();

                if (!opcion.equalsIgnoreCase("S")) { // Valida si el usuario quiere ingresar otra palabra
                    break;
                }
            }
        }

        System.out.println("Las palabras ingresadas son: ");

        int cont = 0;

        for (int i = 0; i < palabras.length; i++) {
            System.out.println((i + 1) + "- " + palabras[i]); // Muestra las palabras almacenadas
        }

        Contador contador = new Contador(); // Crea una instancia del contador de letras

        while (true) {
            System.out.println("\nIngrese el número de la palabra que desea contar la frecuencia: ");
            String eleccion = teclado.nextLine(); // Captura la elección del usuario
            try {
                int indice = (Integer.parseInt(eleccion) - 1); // Calcula el indice de la palabra en el Array
                contador.conteoFrecuenciaLetras(palabras[indice]); // Llama al método pasandole como String la palabra a contar la frecuencia
                break;
            } catch (Exception ignored) { // Captura excepción si no es un número correspondiente a un indice existente
                System.out.println("\"" + eleccion + "\"" + " no es un número válido!");
            }
        }
    }
}