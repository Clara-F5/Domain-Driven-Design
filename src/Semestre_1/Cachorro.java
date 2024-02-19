package Semestre_1;

class TesteCachorro {
    public static void main(String[] args) {
        //Criei meu objeto do tipo Semestre_1.Cachorro
        Cachorro cachorroSemArgumentos = new Cachorro();
        Cachorro poodle = new Cachorro("Toto");
        Cachorro cachorroComIdade = new Cachorro("Floquinho", 3);
        System.out.println(poodle.nome);
        System.out.println(poodle.tamanho);
        System.out.println(poodle.idade);
        poodle.raca = "Poodle";
        poodle.tamanho = "pequeno";
        poodle.idade = 1;
        poodle.cor = "Branca";
        System.out.format( "Nome: %s, raca: %s, tamanho: %s, idade: %s, cor: %s\n\n",
                poodle.nome,
                poodle.raca,
                poodle.tamanho,
                poodle.idade,
                poodle.cor);
        poodle.sentar();
    }}
class Cachorro {
    String nome;
    String raca;
    String tamanho = "medio";
    int idade;    String cor;
    Cachorro() {
        System.out.println("Criando meu objeto pelo construtor padrao");
    }
    Cachorro(String nomeDoMeuCachorro) {
        System.out.println("Criando meu objeto com o nome " + nomeDoMeuCachorro);
        nome = nomeDoMeuCachorro;
    }
    Cachorro(String nomeDoMeuCachorro, int idadeDoMeuCachorro) {
        this(nomeDoMeuCachorro);
        System.out.println("Chamando construtor com nome e idade");
        idade = idadeDoMeuCachorro;
    }
    void sentar() {
        System.out.println(nome + " esta sentado");
    }
    void correr() {
        System.out.println(nome + " esta correndo");
    }
    void comer() {
        System.out.println(nome + " esta comendo");
    }
    void dormir() {
        System.out.println(nome + " esta dormindo");
    }}