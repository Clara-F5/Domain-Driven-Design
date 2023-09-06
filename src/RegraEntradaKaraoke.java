class RegraEntradaKaraoke{


public static void main(String[] args){

int idade1 = Integer.parseInt(args[0]);
int idade2 = Integer.parseInt(args[1]);
int hora = Integer.parseInt(args[2]);

boolean funcionamento = (hora >= 18 && hora <= 23) || (hora >= 0 && hora <= 4);
boolean possibilidade1 = idade1 >= 18 && idade2 >= 18;
boolean possibilidade2 = (idade1 >= 18 || idade2 >= 18) && hora < 22;

boolean regra = funcionamento && (possibilidade1 || possibilidade2);

System.out.println("Pode entrar no Karaoke?: "+regra);

}
}