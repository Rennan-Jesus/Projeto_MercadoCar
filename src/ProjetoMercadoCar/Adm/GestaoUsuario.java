
package ProjetoMercadoCar.Adm;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GestaoUsuario {

    public static void gestaoUsuario() throws IOException {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> usuarios = new ArrayList<>();

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


        // LER O ARQUIVO

        BufferedReader le = new BufferedReader(
                new FileReader("usuarios.txt")
        );

        String linha;

        while ((linha = le.readLine()) != null) {

            String[] dados = linha.split(";");

            if (dados.length == 5) {
                usuarios.add(linha);
            }
        }

        le.close(); /*readLine() lê uma linha do arquivo.



linha = guarda o conteúdo dessa linha na variável.



!= null verifica se ainda existe uma linha para ler. */


        // OPÇÃO CADASTRAR

        if (digitado == 1) {

            System.out.println("Digite o nome completo:");
            String nome = entrada.nextLine();

            String criarCpf;

            do {
                System.out.println("Digite o seu CPF:");
                criarCpf = entrada.nextLine();

                if (criarCpf.length() != 11) {
                    System.out.println("CPF inválido! Digite 11 números.");
                }

            } while (criarCpf.length() != 11);

            System.out.println("Crie uma senha de acesso:");
            String novaSenha = entrada.nextLine();

            System.out.println("Qual o perfil? (Cliente, Gerente ou Administrador):");
            String perfil = entrada.nextLine();

            perfil = perfil.trim().toLowerCase();

            BufferedWriter escritor = new BufferedWriter(
                    new FileWriter("usuarios.txt", true)
            );

            escritor.write(nome + ";" + criarCpf + ";" + novaSenha + ";" + perfil + ";ATIVO");
            escritor.newLine();

            escritor.close();

            System.out.println("\nUsuário cadastrado!");
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + criarCpf);
            System.out.println("Perfil: " + perfil);
        }


        // OPÇÃO EDITAR

        else if (digitado == 2) {

            System.out.println("Área de edição de usuários.");

            System.out.println("Digite o CPF que deseja editar:");
            String novoCpf = entrada.nextLine();

            boolean encontrou = false;

            for (int i = 0; i < usuarios.size(); i++) {

                String[] dados = usuarios.get(i).split(";");

                if (dados[1].equals(novoCpf)) {

                    System.out.println("Digite o novo nome:");
                    String novoNome = entrada.nextLine();

                    dados[0] = novoNome;

                    usuarios.set(i, dados[0] + ";" + dados[1] + ";" +
                            dados[2] + ";" + dados[3] + ";" + dados[4]);

                    encontrou = true;
                }
            }

            if (encontrou == true) {

                BufferedWriter escrever = new BufferedWriter(
                        new FileWriter("usuarios.txt")
                );

                for (int j = 0; j < usuarios.size(); j++) {
                    escrever.write(usuarios.get(j));
                    escrever.newLine();
                }

                escrever.close();

                System.out.println("Cadastro atualizado!");
            }
            else {
                System.out.println("Usuário não encontrado!");
            }
        }


        // OPÇÃO INATIVAR

        else if (digitado == 3) {

            System.out.println("Área de inativação de usuários.\n");

            System.out.println("Digite o CPF do usuario:");
            String desativarCpf = entrada.nextLine();

            boolean encontrou = false;

            for (int k = 0; k < usuarios.size(); k++) {

                String[] dados = usuarios.get(k).split(";");

                if (dados[1].equals(desativarCpf)) {

                    dados[4] = "INATIVO";

                    usuarios.set(k, dados[0] + ";" + dados[1] + ";" +
                            dados[2] + ";" + dados[3] + ";" + dados[4]);

                    System.out.println("Usuario inativado!");
                    encontrou = true;
                }
            }

            if (encontrou == true) {

                BufferedWriter escrever = new BufferedWriter(
                        new FileWriter("usuarios.txt")
                );

                for (int k = 0; k < usuarios.size(); k++) {
                    escrever.write(usuarios.get(k));
                    escrever.newLine();
                }

                escrever.close();
            }
            else {
                System.out.println("CPF nao encontrado!");
            }
        }
    }
}
