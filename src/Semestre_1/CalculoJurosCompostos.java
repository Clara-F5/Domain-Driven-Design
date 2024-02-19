package Semestre_1;

class CalculoJurosCompostos{

public static void main(String[] args){

String c = args[0];
String tj = args[1];
String m = args[2];

  double capital = Double.parseDouble(c);
    double taxa = Double.parseDouble(tj);
	  double meses = Double.parseDouble(m);
	  
	  double montante = capital * Math.pow((1 + taxa), meses);
	  
	 System.out.println("Capital: "+capital+"Taxa: "+taxa+"Meses: "+meses+"Montante: "+montante);

}

}