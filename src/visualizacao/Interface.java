package visualizacao;

import java.util.Scanner;
import modulo.*;

public class Interface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cadastro list = new Cadastro();
        char op;
        System.out.println("Bem vindo ao site de cadadastro de termos no dicionário: ");
        menuCadastro();
        do {
            System.out.println();
            System.out.println("Digite 6 para rever o menu.");
            System.out.print("Informe a sua opção desejada: ");
            op = in.next().charAt(0);
            if (op == '1') {
                list.inserir();
                System.out.println("Olá 5");
            }
            else if (op == '6') {
                menuCadastro();
            }
            else if (op == '0') {
                System.out.println("Espero te ver de novo por aqui.");
            }
            else {
                System.out.println("Opção inválida.");
            }
        } while(op != '0');
    }

    private static void menuCadastro() {
        System.out.println("1 - Incerir um novo termo.");
        System.out.println("2 - Remover um termo já registrado");
        System.out.println("3 - Exibir a descrição de um termo.");
        System.out.println("4 - Editar a descrição de um termo.");
        System.out.println("5 - Exibir todas os temos cadastrados.");
        System.out.println("0 - Sair do site");
    }
}