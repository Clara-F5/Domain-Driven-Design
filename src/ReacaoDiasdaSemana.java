class ReacaoDiasdaSemana{

public static void main(String[] args){

String numString = args[0];

int dia = Integer.parseInt(numString);

switch(dia){

case 1:
	System.out.println("Ainda é segunda");
	break;
case 2:
	System.out.println("Ainda é terça");
	break;
case 3:
	System.out.println("Quarta...");
	break;
case 4:
case 5:
	System.out.println("Quase fds");
	break;
case 6:
case 7:
	System.out.println("FDS!!");
	break;
	
default: 
	System.out.println("Dia inválido");
}

}
}