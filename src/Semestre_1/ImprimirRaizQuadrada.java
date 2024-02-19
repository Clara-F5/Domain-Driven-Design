package Semestre_1;

import java.util.Scanner;

class ImprimirRaizQuadrada{

public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);
	 double numero = 0;

while(true){

 System.out.println("Digite um número para que a raíz quadrada seja calculada ou - 1 para encerrar");
 numero = sc.nextDouble();
 
 if(numero == -1){
	 break;
 }
 
 double raizQuadrada = Math.sqrt(numero);
  
 System.out.println("RAIZ QUADRADA = "+raizQuadrada);  

}

 System.out.println("Programa Encerrado");

}

}