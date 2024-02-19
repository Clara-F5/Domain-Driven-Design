package Semestre_1;

class TesteCarro {

    public static void main(String[] args) {

        Carro carrinho = new Carro("fastback", "fiat", "branco", true);

        carrinho.descreverCarro();

        carrinho.ligarOuDesligar();

        carrinho.velocidade = 5;

        carrinho.acelerar();

        carrinho.descreverCarro();

        carrinho.freiar();

        carrinho.mudarMarcha(-1);


        carrinho.descreverCarro();


    }
}


public class Carro {

    String modelo;
    String marca;
    String cor;
    boolean automatico;
    int marchaAtual = 0;
    double velocidade = 0;
    boolean ligado = false;

 Carro(String modelo, String marca, String cor, boolean automatico){
     this.modelo = modelo;
     this.marca = marca;
     this.cor = cor;
     this.automatico = automatico;
    }

    void acelerar() {
        if (ligado) {
            velocidade += 1;
        }
    }
     void freiar(){
         if(ligado){
             velocidade -=1;
         }
        }

     void descreverCarro(){
         System.out.println("Atributos do carro");
         System.out.println("marca: "+marca);
         System.out.println("modelo:"+modelo);
         System.out.println("cor: "+cor);
         System.out.println("automatico: "+automatico);
         System.out.println("velocidade:"+velocidade);
         System.out.println("marcha atual:"+marchaAtual);
         System.out.println("ligado:"+ligado);
     }

    public boolean ligarOuDesligar() {
        ligado = !ligado;
        return ligado;

 }

    public boolean mudarMarcha(int marcha) {
        if (marcha < -1 || marcha > 5) {
            return false;
        }
        if (marcha == -1 && marcha != 0){
            return false;
        }
        marchaAtual = marcha;
        return true;
    }
}

