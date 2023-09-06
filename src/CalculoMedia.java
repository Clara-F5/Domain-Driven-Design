class CalculoMedia{

public static void main(String[] args){

String nome = args[0];

double nota1 = Double.parseDouble(args[1]);
double nota2 = Double.parseDouble(args[2]);
double nota3 = Double.parseDouble(args[3]);
double nota4 = Double.parseDouble(args[4]);

double media = (nota1+nota2+nota3+nota4)/4;

boolean passou = media >= 5.5;

System.out.println("Aluno: "+nome+" Média: "+media+" Passou?: "+passou);


}

}