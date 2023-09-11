class ComparadorComplexo{

public static void main(String[] args){

int num1 = Integer.parseInt(args[0]);

int num2 = Integer.parseInt(args[1]);

if(num1 > num2 * 2){
	System.out.println("primeiro argumento é maior que o dobro do segundo");
}else if(num1 > num2){
	System.out.println("O primeiro argumento é maior que o segundo");
}else if(num2 > num1 * 2) {
	System.out.println("segundo argumento é maior que o dobro do primeiro");
}else if(num2 > num1){
	System.out.println("O segundo argumento é maior que o primeiro");
}else{
	System.out.println("Os argumentos são iguais");
}

}
}