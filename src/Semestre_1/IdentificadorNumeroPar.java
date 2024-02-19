package Semestre_1;

class IdentificadorNumeroPar{

public static void main(String[] args){


int num = Integer.parseInt(args[0]);

if(num%2 == 0 ){
	System.out.println("O número é par");
} else {
	System.out.println("O número é ímpar");
}

}
}