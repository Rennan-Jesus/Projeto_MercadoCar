package ProjetoMercadoCar.Main;
import ProjetoMercadoCar.Login.CadastroUsuarios;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static ProjetoMercadoCar.Adm.Administrador.adm;

public class MercadoCar {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);



        int digitado;

        // ==== O QUE DESEJA fAZER === //



        System.out.println("O que deseja Fazer? ");


        do {

            System.out.println("0- Login");
            System.out.println("1- Entrar na Areá do Administrador");
            System.out.println("2- Entrar na Areá do Gerente");
            System.out.println("3- Entrar na Areá do Cliente");

try {
     digitado = entrada.nextInt();
}catch (InputMismatchException e){
    System.out.println("Digite um número correto");
    entrada.nextLine();
    digitado = -1;
}
        }while (digitado >3 || digitado <0);

if (digitado == 0){
    CadastroUsuarios.cadastro();
}

        else if (digitado == 1){
            adm();
        } else if (digitado == 2) {

        }else {

        }

    }

}

/* === AREÁ DO ADMINISTRADOR === */

