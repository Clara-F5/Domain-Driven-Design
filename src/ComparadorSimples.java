class ComparadorSimples{

public static void main (String[] args){

int num1 = Integer.parseInt(args[0]);

int num2 = Integer.parseInt(args[1]);

if (num1 > num2){
 System.out.println("o primeiro argumento é maior que o segundo");
}else if (num2 > num1){
 System.out.println("o segundo argumento é maior que o primeiro");
}else {
System.out.println("Os argumentos são iguais");
}

}

}