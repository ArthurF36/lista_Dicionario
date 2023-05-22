package modulo;

import java.util.Scanner;
import controle.*;

public class Cadastro {
    Scanner in = new Scanner(System.in);
    Scanner input = new Scanner(System.in);

    private final Validacao valid;

    public Cadastro() {
        this.valid = new Validacao();
    }

    public void inserir(listaPrinc princ) {
        Letra letterList;
        Termo term;
        String name, descr;
        char letter;
        boolean nameValid;
        System.out.print("Informe o nome para lista: ");
        name = in.nextLine().toUpperCase();
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
            System.out.println("Nome não válido.");
        }
    }

    public void remover(listaPrinc princ) {
        Letra letterList;
        Termo term;
        String name;
        char letter;
        boolean nameValid;
        System.out.print("Informe o nome que deseja ser removido: ");
        name = in.nextLine().toUpperCase();
        nameValid = valid.testeTermo(name);
        if (nameValid) {
            letter = name.charAt(0);
            letterList = new Letra(letter);
            term = new Termo(name);
            princ.removerPrinc(letterList, term);
        }
        else {
            System.out.println("Nome não válido.");
        }
    }

    public void exibir(listaPrinc princ) {
        Letra letterList;
        Termo term;
        String name;
        char letter;
        boolean nameValid;
        System.out.print("Informe o nome desejado para sua busca: ");
        name = in.nextLine().toUpperCase();
        nameValid = valid.testeTermo(name);
        if (nameValid) {
            letter = name.charAt(0);
            letterList = new Letra(letter);
            term = new Termo(name);
            princ.exibirDescr(letterList, term);
        }
        else {
            System.out.println("Nome não válido.");
        }
    }

    public void editar(listaPrinc princ) {
        Letra letterList;
        Termo term;
        String name;
        char letter;
        boolean nameValid;
        System.out.print("Informe o nome desejado para sua edição: ");
        name = in.nextLine().toUpperCase();
        nameValid = valid.testeTermo(name);
        if (nameValid) {
            letter = name.charAt(0);
            letterList = new Letra(letter);
            term = new Termo(name);
            princ.editarPrinc(letterList, term);
        }
        else {
            System.out.println("Nome não válido.");
        }
    }

    public void exibirLetra(listaPrinc princ) {
        Letra letterList;
        char letter;
        boolean letterValid;
        System.out.print("Informe a letra desejada para exibição: ");
        letter = Character.toUpperCase(input.next().charAt(0));
        letterValid = valid.testLetra(letter);
        if (letterValid) {
            letterList = new Letra(letter);
            princ.exibirLetra(letterList);
        }
        else {
            System.out.println("Letra não válida.");
        }
    }
}