package Semestre_2.br.fiap.ddd.excecao;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MeuTesteComExcecoes {
    public static void main(String[] args) {
//        Object a = null;
//        System.out.println(a.toString());


        try{
            System.out.println("Bloco Try");
            File arquivo = new File("arquivo.txt");
            Files.readAllBytes(arquivo.toPath());
        }catch (IOException ex){
            System.out.println("Deu erro");
            System.out.println("Bloco Catch");
        }finally {
            System.out.println("Bloco Finally");
        }

        System.out.println("fim do programa");
    }
}
