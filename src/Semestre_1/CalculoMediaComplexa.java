package Semestre_1;

class CalculoMediaComplexa{

public static void main(String[] args){

String nome = args[0];

double nota1 = Double.parseDouble(args[1]);
double nota2 = Double.parseDouble(args[2]);
double nota3 = Double.parseDouble(args[3]);
double nota4 = Double.parseDouble(args[4]);
double nota5 = Double.parseDouble(args[5]);


double media = ((nota1 * 1)+(nota2 * 1)+(nota3 * 1)+(nota4 * 2)+(nota5 * 5))/(1+1+1+2+5);

boolean passou = media >= 5.5 && nota1!=0  && nota2!=0 && nota3!=0  && nota4!=0  && nota5!=0;

System.out.println("Aluno: "+nome+" Média: "+media+" Passou?: "+passou);


}

}