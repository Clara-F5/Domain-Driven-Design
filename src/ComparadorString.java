class ComparadorStrings{

public static void main (String[] args){
	
	String primeiraString = args[0];
	String segundaString = args[1];

   System.out.println("Primeiro argumento:"+primeiraString);
   
   System.out.println("Segundo argumento:"+segundaString);
 
   
   boolean compara = primeiraString.equals(segundaString);
   
   System.out.println("Strings são iguais:"+compara);
   
   if(compara == true){
	    System.out.println("Strings iguais");
   }else{
	    System.out.println("Strings Diferentes");
   }
}

}