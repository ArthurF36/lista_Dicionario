package controle;

import java.util.Scanner;

public class Validacao {
    public boolean testeTermo(String nome) {
        Scanner in = new Scanner(System.in);
        char letter;
        int i , size;
        size = nome.length();
        for (i = 0; i <= size - 1; i++) {
            letter = nome.charAt(i);
            if (!Character.isLetter(letter)) {
                return false;
            }
        }
        return true;
    }
}