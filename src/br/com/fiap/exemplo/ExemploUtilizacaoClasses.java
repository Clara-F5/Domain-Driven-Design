package br.com.fiap.exemplo;

public class ExemploUtilizacaoClasses {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Clara", "Fonte");
        System.out.println(eu);
        System.out.println(ReflectionToStringBuilder.toString(eu));
    }
}
class Pessoa{

    String nome;
    String sobrenome;

    Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
}