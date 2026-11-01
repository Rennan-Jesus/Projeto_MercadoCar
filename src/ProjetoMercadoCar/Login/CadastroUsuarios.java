package ProjetoMercadoCar.Login;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroUsuarios {
    static ArrayList <String> usuarios = new ArrayList<>();
    static ArrayList <String> senha = new ArrayList<>();
    public static void cadastro (){



        Scanner entrada = new Scanner(System.in);


        System.out.println("1 - Fazer Login");
        System.out.println("2 - Criar Nova Conta");
        System.out.println("3- Alterar Senha");
        System.out.println("0- Sair");
        int digito = entrada.nextInt();
        entrada.nextLine();

        if (digito == 1){

        } else if (digito == 2) {
            System.out.println("Digite o seu CPF");
           String criarCpf = entrada.nextLine();

            System.out.println("Digite uma senha: ");
           String criarSenha = entrada.nextLine();

            usuarios.add(criarCpf);
            senha.add(criarSenha);

            for (int i = 0; i < usuarios.size(); i++) {
            if (criarCpf .equals(usuarios.get(i))){
                                     break;
                }
            }

        } else if (digito == 3) {

        }else {
            System.out.println("Saindo");
        }



    }
}
