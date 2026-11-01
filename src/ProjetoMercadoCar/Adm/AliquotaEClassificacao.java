package ProjetoMercadoCar.Adm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AliquotaEClassificacao {
    public static void configFiscal() {
        Scanner entrada = new Scanner(System.in);


        double icmsrecebido, issrecebido;

        /* ICMS */
do {
            try {
                System.out.println("Informe a nova alíquota do ICMS (%):");
                icmsrecebido = entrada.nextDouble();

                if (icmsrecebido < 0 || icmsrecebido > 100) {
                    System.out.println("Digite um percentual entre 0 e 100!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido!");
                entrada.nextLine();
                icmsrecebido = -1;
            }

        } while (icmsrecebido < 0 || icmsrecebido > 100);

/* ISS */
        do {
            try {
                System.out.println("Informe a nova alíquota do ISS (%):");
                issrecebido = entrada.nextDouble();

                if (issrecebido < 0 || issrecebido > 100) {
                    System.out.println("Digite um percentual entre 0 e 100!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido!");
                entrada.nextLine();
                issrecebido = -1;
            }

        } while (issrecebido < 0 || issrecebido > 100);

        System.out.println("Resultado da Configuração Fiscal:");

        System.out.println("ICMS configurado para: " + icmsrecebido + "% | ISS configurado para: " + issrecebido + "%");
    }
}



