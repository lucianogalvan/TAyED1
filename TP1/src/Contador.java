//Nombre: Luciano Ezequiel Galván
//Legajo: VINF012232
//DNI: 35.089.500
//Fecha: 02/06/2022

public class Contador {

    private final int[] conteos = new int[26];

    public Contador() {
    }

    public void conteoFrecuenciaLetras(String palabra) {

        //Cuenta la frecuencia de cada letra...

        for (int i = 0; i < palabra.length(); i++) {
            try {
                conteos[palabra.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(palabra.charAt(i) + ": No es una letra");
            }
        }

        //imprimir frecuencias...
        for (int i = 0; i < conteos.length; i++)
            if (conteos[i] != 0)
                System.out.println((char) (i + 'A') + ": " + conteos[i]);
    }
}
