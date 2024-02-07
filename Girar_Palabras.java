
public class Main {
  public static void main(String[] args) {
     	String original = "Es esta la frase que quieres girar  !";
        
         //Divir la frase en palabras en una lista 
        String[] lista = original.split(" ");
        
         String letra = "";
         //Invertir las letras de cada palabra
        
          
            //Coger el numero total de palabras que halla
           
            for (int i = 0; i < lista.length ; i++){
                
                int len = lista[i].length();
                String palabra = lista[i];
                //char  c = a.charAt(0);
                //String as= String.valueOf(c);;
                String pala = "";
                for (int j = 0; j != len; len-- ){
                    
                     char letra_c = palabra.charAt(len-1);
                     
                    String str = String.valueOf(letra_c);
                   	pala = pala + str;
                    
                }
                lista[i]= pala;
                
            }
         
         //Volver a montar la frase
		String ter = lista[0];
        for (int i = 1; i < lista.length; i++){
        	ter = ter + " " + lista[i];
        }
        System.out.println(ter);
        
         
         
  }
}
