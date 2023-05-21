package modulo;

import java.util.Scanner;
import controle.*;

public class Cadastro {
    public void inserir() {
        Scanner in = new Scanner(System.in);
        Validacao valid = new Validacao();
        Termo term;
        String name, descr;
        boolean nameValid;
        System.out.println("Olá 2");
        System.out.println("Olá 3");
        System.out.print("Informe o nome para lista: ");
        name = in.nextLine();
        nameValid = valid.testeTermo(name);
        if (nameValid) {
            System.out.print("Informe a sua descrição: ");
            descr = in.nextLine();
            term = new Termo(name, descr);
        }
        else {
            System.out.println("Nome não valido para insesão.");
        }
    }
}