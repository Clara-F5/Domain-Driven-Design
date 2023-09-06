class CalculoHipotenusa{

public static void main(String[] args){

double cateto1 = Double.parseDouble(args[0]);

double cateto2 = Double.parseDouble(args[1]);


double somaCatetos = Math.pow(cateto1,2) + Math.pow(cateto2,2);

double hipotenusa = Math.sqrt(somaCatetos);


System.out.println("Primeiro Cateto:"+cateto1);
System.out.println("Segundo Cateto:"+cateto2);
System.out.println("Hipotenusa:"+hipotenusa);

}

}