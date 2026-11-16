package ProjetoMercadoCar.Main;
import ProjetoMercadoCar.Login.CadastroUsuarios;

import java.io.IOException;
import java.util.Scanner;

import static ProjetoMercadoCar.Adm.Administrador.adm;

public class MercadoCar {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);


        CadastroUsuarios.cadastro();


       adm();

    }

}

/* === AREÁ DO ADMINISTRADOR === */

