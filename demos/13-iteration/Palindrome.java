public class Palindrome {
 
  private   static boolean esPalindrome(String  phrase){
        //convertir a minuscula
        phrase = phrase.toLowerCase();

        // quitar el espacio
         phrase = phrase.replaceAll("", "");

         for(int i = 0; i < phrase.length()/2; i++){
            if(phrase.charAt(i) != phrase.charAt(phrase.length()-1 - i)){
                return false;
            }
         }
         return true;
    }


    // crea una funcion que cuente las vocales que contiene una palabra dada por parámetros
    
  // private  static int  countVariables(String word){
   


    

    public static void main(String[] args) {
        
      String phrase = "Ella te da detalles";
      boolean result = esPalindrome((phrase));
      System.out.println("¿Es palindrome? " + result);
    }
    
}
