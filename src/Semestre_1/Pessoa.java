package Semestre_1;

class TestePessoa{

    public static void main(String[] args){

        Pessoa clara = new Pessoa("Clara", "Fonte", 63000, 153 );

        clara.getNomeCompleto();
        clara.getAlturaEmMetros();
        clara.getPesoEmQuilogramas();

        clara.descreverPessoa();

    }
}



public class Pessoa {

    String nome;
    String sobrenome;
    int pesoEmGramas;
    int alturaemCentimetros;

    Pessoa() {

    }

    Pessoa(String nome, String sobrenome, int pesoEmGramas, int alturaemCentimetros){

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.pesoEmGramas = pesoEmGramas;
        this.alturaemCentimetros = alturaemCentimetros;
    }

    void descreverPessoa(){
        System.out.println("Descrição da Semestre_1.Pessoa");
        System.out.println("nome completo:"+getNomeCompleto());
        System.out.println("altura:"+getAlturaEmMetros());
        System.out.println("peso:"+getPesoEmQuilogramas());
    }
    public String getNomeCompleto() {
        return nome + " " +sobrenome;
    }

    public double getPesoEmQuilogramas(){
        return (double) pesoEmGramas /1000;
    }

    public double getAlturaEmMetros(){
        return (double) alturaemCentimetros/100;
    }
}
