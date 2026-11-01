package ProjetoMercadoCar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MercadoCar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        adm();

    }



/* === AREÁ DO ADMINISTRADOR === */

    public static void adm() {

        Scanner entrada = new Scanner(System.in);

        int digitado;


        /* VENDO SE A PESSOA DIGITOU CERTO* }catch (NumberFormatException e){
        System.out.println("Digite um número");
    }*/

        do {




            System.out.println("1 - Gerenciar usuários (cadastrar, editar, inativar) ");
            System.out.println("2 - Configurar alíquotas e classificação fiscal");
            System.out.println("0 - Sair ");
        try {
            digitado = entrada.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Digite um número \n");
            entrada.nextLine();
            digitado = -1;
        }
            if (digitado > 2 || digitado < 0) {

                System.out.println("Digite um número correto:");
            }

        }while (digitado > 2 || digitado < 0);



        if (digitado == 1) {

            do {

                System.out.println("");
            }while(digitado >1 ||digitado <2);



        } else if (digitado == 2) {

        } else {
            System.out.println("SaindO");
        }


    }
}