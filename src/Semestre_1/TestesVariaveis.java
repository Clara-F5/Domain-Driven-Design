package Semestre_1;

public class TestesVariaveis {

    public static void main (String[] args){

        String periodoDia;
        String nome;
        String despedida;

        nome = String.format("%s", args[0]);
        periodoDia = String.format("%s", args[1]);
        despedida = String.format("%s", args[2]);

        nome = "Daniel";
        periodoDia = "dia";
        despedida = "adeus";

        System.out.format("Olá %s",args[0]);



    }
}
