class PegraVestiarioFeminino{

public static void main(String[] args){

   String idadeString = args[0];
   String sexo = args[1];
   
   int idade = Integer.parseInt(idadeString);
   
   boolean mulher = sexo.equals("F");
   
   boolean menorDeSeis = idade<=6;
   
   boolean homem = sexo.equals("M");
   
   boolean comparar = mulher || (menorDeSeis && homem);
   
   System.out.println("Pode entrar? "+comparar);

}
}