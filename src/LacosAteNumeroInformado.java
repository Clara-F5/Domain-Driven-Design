import java.util.Scanner;

public class LacosAteNumeroInformado {

    public static void main(String[] args){

        int num ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número máximo da contagem: ");
        num = sc.nextInt();
        int i = 1;

        System.out.println("Laço de contagem progressiva");
        while(i <= num){
            System.out.println(i);
            i +=1;
        }

        System.out.println("Laço de contagem regressiva até -5 ");
        for(i = num; i >= -5; i--){
            System.out.println(i);
        }
    }
}
