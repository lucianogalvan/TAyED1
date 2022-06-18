import java.util.Arrays;

public class Stack
{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private char elements[];

    public Stack() {
        elements = new char[DEFAULT_CAPACITY];
    }

    public void push(char c) {
        if (size == elements.length) {
            System.out.println("No queda espacio para almacenar el caracter, por favor primero desapile un caracter.");
        }
        else {
            elements[size++] = c;
            System.out.println("Caracter \"" + c + "\" apilado!");
        }
    }

    public char pop() {
        char c = elements[--size];
        elements[size] = 'x';
        return c;
    }

    public boolean isEmpty() {
        return (size<1);
    }
}
