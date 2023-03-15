import java.net.Socket;
import java.util.Scanner;
import java.util.Stack;

/**
 * Andre marroquin
 * RETO
 */
public class Main {
    /**
     * Andre marroquin
     * metodo para evaluar una cadena de a y b
     * Si esta vacia es aceptada si no no
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa cuantas las letras a que va a tener su cadena (NO EN NUMERO): ");
        char variableA = scanner.nextLine().charAt(0);
        System.out.print("Ingresa cuantas las letras b que va a tener su cadena (NO EN NUMERO): ");
        char variableB = scanner.nextLine().charAt(0);

        System.out.print("Ingresa la cadena a evaluar juntando la cantidad de a y b ingresada antes: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        stack.push('$');

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char stackTop = stack.peek();
            if (currentChar == variableA && stackTop == '$') {
                stack.push(currentChar);
            } else if (currentChar == variableA && stackTop == variableA) {
                stack.push(currentChar);
            } else if (currentChar == variableB && stackTop == variableA) {
                stack.pop();
            } else if (currentChar == variableB && stackTop == '$') {
                System.out.println("La cadena no es válida");
                return;
            } else {
                System.out.println("La cadena no es válida");
                return;
            }
        }
        
        if (stack.size() == 1 && stack.peek() == '$') {
            System.out.println("La cadena es válida");
        } else {
            System.out.println("La cadena no es válida");
        }
    }
    
}
