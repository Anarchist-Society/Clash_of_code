// Debes invertir la entrada e intercambiar los casos
// Input: Una cadena de cadena para procesar.
// Output: La cadena invertida con mayúsculas y minúsculas intercambiadas.
// Constraints: 0 < length of string <= 50
// Example: Hello -> OLLEh

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }

        System.out.println(sb.toString());
        in.close();
    }
}
