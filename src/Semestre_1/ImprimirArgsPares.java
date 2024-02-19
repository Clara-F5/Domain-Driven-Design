package Semestre_1;

class ImprimirArgsPares{

public static void main(String[] args){

	// for(int i =1; i < args.length; i++){
	
	// int []array = Integer.parseInt(args[i]);
	
	// if(array % 2 = 0){
	// System.out.println(array);
	// }
	
	// }

	for(String numeroString: args){
	
		int numero = Integer.parseInt(numeroString);
		
		if(numero % 2 == 0){
			System.out.println(numero);
		}
		
		
		
	}
}
}