import java.util.Scanner;


public class Consigna1 {
    public static void main(String[] args) {
        Stack pila = new Stack();
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nBienvenido! Por favor ingrese la opción que desea realizar: ");
        int elec;

        while (true) {
            System.out.println("\n1 - Apilar");
            System.out.println("2 - Desapilar");
            System.out.println("3 - Consultar si la pila está vacía");
            System.out.println("4 - Mostrar contenida de la pila");
            System.out.println("X - Salir");
            String eleccion = teclado.nextLine(); // Captura la elección del usuario
            if (eleccion.equalsIgnoreCase("X")) {
                break;
            } else {
                try {
                    elec = Integer.parseInt(eleccion);
                    switch (elec) {
                        case 1:
                            System.out.println("\nIngrese el caracter a apilar (si ingresa más de uno se toma el primero): ");
                            String c = teclado.nextLine(); // Captura la elección del usuario
                            try {
                                pila.push(c.charAt(0));
                            } catch (Exception ignored) { // Captura excepción si no es un carater
                                System.out.println("\"" + c.charAt(0) + "\"" + " no es un caracter válido!");
                            }
                            break;
                        case 2:
                            try {
                                System.out.println("\nEl caracter de la cima de la pila es: " + pila.pop());
                            } catch (Exception ignored) { // Captura excepción si no la pila está vacía
                                System.out.println("La pila está vacía, por favor primero apile un caracter!");
                            }
                            break;
                        case 3:
                            if (pila.isEmpty())
                                System.out.println("\nLa pila está vacia!");
                            else
                                System.out.println("\nLa pila tiene caracteres!");
                            break;
                        default:
                            break;
                    }
                } catch (Exception ignored) {
                    System.out.println("\nOpción invalida!");
                }
            }
        }
    }
}
