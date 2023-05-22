package controle;

import java.util.Scanner;

public class Validacao {
    public boolean testeTermo(String nome) {
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

    public boolean testLetra(char letter) {
        if (!Character.isLetter(letter)) {
            return false;
        }
        return true;
    }
}