package Semestre_1;

import java.util.Scanner;

public class NumerosImparesAteNumeroInformado {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite o número máximo");
        num = sc.nextInt();

     for(int i = 0; i <= num; i++){
         if(i % 2 != 0){
         System.out.println(i);
         }
     }
    }
}
