package modulo;

import java.util.Scanner;
import controle.*;

public class Cadastro {
    public void inserir() {
        Scanner in = new Scanner(System.in);
        Validacao valid = new Validacao();
        listaPrinc<Letra> princ = new listaPrinc<>();
        Letra letterList;
        Termo term;
        String name, descr;
        char letter;
        boolean nameValid;
        System.out.print("Informe o nome para lista: ");
        name = in.nextLine().toLowerCase();
        nameValid = valid.testeTermo(name);
        if (nameValid) {
            System.out.print("Informe a sua descrição: ");
            descr = in.nextLine();
            letter = name.charAt(0);
            letterList = new Letra(letter);
            term = new Termo(name, descr);
            princ.inserirPrinc(letterList, term);
        }
        else {
            System.out.println("Nome não valido para insesão.");
        }
    }
}