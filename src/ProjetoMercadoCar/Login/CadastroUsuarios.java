
package ProjetoMercadoCar.Login;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroUsuarios {

    static ArrayList<String> usuarios = new ArrayList<>();
    static ArrayList<String> senha = new ArrayList<>();

    public static void cadastro() throws IOException {

        Scanner entrada = new Scanner(System.in);

        File arquivo = new File("usuarios.txt");

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        usuarios.clear();
        senha.clear();

        // ======== Ler arquivo ========

        BufferedReader leitor = new BufferedReader(
                new FileReader("usuarios.txt")
        );

        String linha;

        while ((linha = leitor.readLine()) != null) {

            String[] dados = linha.split(";");

            if (dados.length == 2) {
                usuarios.add(dados[0]);
                senha.add(dados[1]);
            }
        }

        leitor.close();

        // ======== Menu ========

        System.out.println("1 - Criar Nova Conta");
        System.out.println("2 - Fazer Login");
        System.out.println("3 - Alterar Senha");
        System.out.println("0 - Sair");

        int digito = entrada.nextInt();
        entrada.nextLine();



        // ======== Criar conta ========

        if (digito == 1) {

            String criarCpf;

            do {
                System.out.println("Digite o seu CPF:");
                criarCpf = entrada.nextLine();

                if (criarCpf.length() != 11) {
                    System.out.println("CPF inválido! Digite 11 números.");
                }

            } while (criarCpf.length() != 11);

            System.out.println("Digite uma senha:");
            String criarSenha = entrada.nextLine();

            usuarios.add(criarCpf);
            senha.add(criarSenha);

            BufferedWriter escritor = new BufferedWriter(
                    new FileWriter("usuarios.txt", true)
            );

            escritor.write(criarCpf + ";" + criarSenha);
            escritor.newLine();

            escritor.close();

            System.out.println("Conta criada com sucesso!");

// ======== Fazer login ========


        } else if (digito == 2) {

            System.out.println("Digite o seu CPF:");
            String cpfDigitado = entrada.nextLine();

            System.out.println("Digite sua senha:");
            String senhaDigitada = entrada.nextLine();

            boolean encontrou = false;

            for (int i = 0; i < usuarios.size(); i++) {

                if (cpfDigitado.equals(usuarios.get(i))) {
                    encontrou = true;

                    if (senhaDigitada.equals(senha.get(i))) {

                        System.out.println("Login realizado com sucesso!");
                    } else {

                        System.out.println("Senha incorreta!");}

                    break;
                }
            }

            if (encontrou == false) {
                System.out.println("CPF não encontrado!");
            }

            // ======== Alterar senha ========

        } else if (digito == 3) {

            System.out.println("Digite o seu CPF:");
            String cpfDigitado = entrada.nextLine();

            boolean encontrou = false;

            for (int i = 0; i < usuarios.size(); i++) {

                if (cpfDigitado.equals(usuarios.get(i))) {

                    encontrou = true;

                    System.out.println("Digite sua nova senha:");
                    String novaSenha = entrada.nextLine();

                    senha.set(i, novaSenha);

                    BufferedWriter escritor = new BufferedWriter(
                            new FileWriter("usuarios.txt")
                    );

                    for (int j = 0; j < usuarios.size(); j++) {

                        escritor.write(usuarios.get(j) + ";" + senha.get(j));
                        escritor.newLine();
                    }

                    escritor.close();

                    System.out.println("Senha alterada com sucesso!");

                    break;
                }
            }

            if (encontrou == false) {
                System.out.println("CPF não encontrado!");
            }

        } else if (digito == 0) {

            System.out.println("Saindo...");

        } else {

            System.out.println("Opção inválida!");
        }
    }
}
