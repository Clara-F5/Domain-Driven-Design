class PedraTesouraPapel{

public static void main(String[] args){

String primeiro = args[0];
String segundo = args[1];

switch(primeiro){
	 case "pedra":
	 
	   switch(segundo){
	   case "papel":
			System.out.println("Jogador 2 ganhou");
			break;
	   case "tesoura":
			System.out.println("Jogador 1 ganhou");
			break;
	   case "pedra":
			System.out.println("EMPATE");
			break;
		default:
			System.out.println("Opções inválidas");
	   }
	   break;
	   
	case "papel":
	   switch(segundo){
		case "tesoura":
			System.out.println("Jogador 2 ganhou");
			break;
	   case "pedra":
			System.out.println("Jogador 1 ganhou");
			break;
	   case "papel":
			System.out.println("EMPATE");
			break;
		default:
			System.out.println("Opções inválidas");
	   }
	   break;
	   
   case "tesoura":
   	   switch(segundo){
	   case "pedra":
			System.out.println("Jogador 2 ganhou");
			break;
	   case "papel":
			System.out.println("Jogador 1 ganhou");
			break;
	   case "tesoura":
			System.out.println("EMPATE");
			break;
		default:
			System.out.println("Opções inválidas");
	   }
	   break;
	   
  default:
  System.out.println("Opções inválidas");
}

}
}