package visualizacao;

import java.util.Scanner;
import modulo.*;

public class Interface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cadastro list = new Cadastro();
        listaPrinc princ = new listaPrinc();
        char op;
        System.out.println("Bem vindo ao site de cadadastro de termos no dicionário: ");
        menuCadastro();
        do {
            System.out.println();
            System.out.println("Digite 7 para rever o menu.");
            System.out.print("Informe a sua opção desejada: ");
            op = in.next().charAt(0);
            if (op == '1') {
                list.inserir(princ);
            }
            else if (op == '3') {
                list.exibir(princ);
            }
            else if (op == '4') {
                list.editar(princ);
            }
            else if (op == '5') {
                princ.exibirPrinc();
            }
            else if (op == '6') {
                list.exibirLetra(princ);
            }
            else if (op == '7') {
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
        System.out.println("1 - Incerir um novo termo."); //Ok
        System.out.println("2 - Remover um termo já registrado");
        System.out.println("3 - Exibir a descrição de um termo."); //Ok
        System.out.println("4 - Editar a descrição de um termo."); //Ok
        System.out.println("5 - Exibir todas os temos cadastrados."); //Ok
        System.out.println("6 - Exibi todos os termos com a mesma letra inicial.");
        System.out.println("0 - Sair do site");
    }
}