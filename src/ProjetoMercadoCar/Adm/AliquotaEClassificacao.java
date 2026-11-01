package ProjetoMercadoCar.Adm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AliquotaEClassificacao {
    public static void configFiscal() {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Informe a nova alíquota do ICMS (%):");
        double icmsrecebido = entrada.nextDouble();

        double icms = icmsrecebido / 100;
        System.out.println("Informe a nova alíquota do ISS (%):");
        double issrecebido = entrada.nextDouble();


        double iss = issrecebido / 100;
        System.out.println("Resultado da Configuração Fiscal:");

        System.out.println("ICMS configurado para: " + icms + "% | ISS configurado para: " + iss + "%");
    }
}



