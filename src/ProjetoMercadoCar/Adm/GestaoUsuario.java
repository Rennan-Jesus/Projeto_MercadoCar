
package ProjetoMercadoCar.Adm;

import java.util.Scanner;
import java.util.InputMismatchException;

public class GestaoUsuario {

    public static void gestaoUsuario() {

        Scanner entrada = new Scanner(System.in);

        int digitado = -1;

        do {
            System.out.println("--- Gestão de Usuários ---\n");
            System.out.println("Escolha a opção:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Editar");
            System.out.println("3 - Inativar");

            try {
                digitado = entrada.nextInt();
                entrada.nextLine();

                if (digitado < 1 || digitado > 3) {
                    System.out.println("Digite uma opção válida!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite um número!");
                entrada.nextLine();
                digitado = -1;
            }

        } while (digitado < 1 || digitado > 3);

        // OPÇÃO CADASTRAR
        if (digitado == 1) {

            System.out.println("Digite o nome completo:");
            String nome = entrada.nextLine();

            System.out.println("Digite o CPF:");
            String cpf = entrada.nextLine();

            System.out.println("Crie uma senha de acesso:");
            String senha = entrada.nextLine();

            System.out.println("Qual o perfil? (Cliente, Gerente ou Administrador):");
            String perfil = entrada.nextLine();

            perfil = perfil.trim().toLowerCase();

            System.out.println("\nUsuário cadastrado!");
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Perfil: " + perfil);
        }

        // OPÇÃO EDITAR
        else if (digitado == 2) {
            System.out.println("Área de edição de usuários.");

            System.out.println("Digite o CPF que deseja Editar");
            String novoCpf = entrada.nextLine();

            System.out.println("Digite o Novo nome para o CPF: " + novoCpf  );
            String novoNome = entrada.nextLine();

            System.out.println("Resultado");
            System.out.println("Cadastro do CPF " + novoCpf + " atualizado para: " + novoNome);
        }

        // OPÇÃO INATIVAR
        else if (digitado == 3) {
            System.out.println("Área de inativação de usuários.");


        }
    }
}
