package ProjetoMercadoCar.Gerente;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Gerente {





        public static void menuGerente() {

            Scanner entrada = new Scanner(System.in);

            int digitado;

            do {
                System.out.println("\n--- MENU DO GERENTE ---");
                System.out.println("1 - Gerenciar Produtos");
                System.out.println("2 - Gerenciar Estoque");
                System.out.println("3 - Gerenciar Vendas");
                System.out.println("0 - Sair");

                try {
                    System.out.println("Escolha uma opção:");
                    digitado = entrada.nextInt();
                    entrada.nextLine();

                    if (digitado < 0 || digitado > 3) {
                        System.out.println("Opção inválida!");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Digite um número!");
                    entrada.nextLine();
                    digitado = -1;
                }

            } while (digitado < 0 || digitado > 3);

            if (digitado == 1) {
                int digito = entrada.nextInt();
                System.out.println("\nÁrea de gerenciamento de produtos.\n");

                System.out.println("Digite o que Deseja Fazer");

                do {
                    System.out.println("-1 Cadastrar produtos");
                    System.out.println("-2 Consultar produtos");
                    System.out.println("-3 Alterar produtos");
                    try {
                        digitado = entrada.nextInt();
                    }catch (InputMismatchException e){
                        System.out.println("Digite um Número Correto");
                        entrada.nextLine();
                        digitado = -1;


                    }
                }while (digitado >3 || digitado <1);
            }

            else if (digitado == 2) {
                System.out.println("Área de gerenciamento de estoque.");
            }

            else if (digitado == 3) {
                System.out.println("Área de gerenciamento de vendas.");
            }

            else if (digitado == 0) {
                System.out.println("Saindo do menu do gerente...");
            }
        }
    }


