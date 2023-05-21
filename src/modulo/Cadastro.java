package modulo;

import java.util.Scanner;
import controle.*;

public class Cadastro {
    public void inserir() {
        Scanner in = new Scanner(System.in);
        Validacao valid = new Validacao();
        String name;
        boolean nameValid;
        System.out.println("Olá 2");
        System.out.println("Olá 3");
        System.out.print("Informe o nome para lista: ");
        name = in.nextLine();
        nameValid = valid.testeTermo(name);
    }
}