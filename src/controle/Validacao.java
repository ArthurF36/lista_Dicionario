package controle;

import java.util.Scanner;

public class Validacao {
    public boolean testeTermo(String nome) {
        Scanner in = new Scanner(System.in);
        char letter;
        int i , size;
        size = nome.length();
        System.out.println("Olá 2");
        for (i = 0; i <= size - 1; i++) {
            letter = nome.charAt(i);
            System.out.println(letter);
        }
        return true;
    }
}