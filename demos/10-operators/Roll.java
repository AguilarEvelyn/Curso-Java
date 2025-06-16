import java.util.Random;
import java.util.Scanner;

public class Roll {

     private static int getDataByScanner(){
       Scanner teclado = new Scanner(System.in);
       System.out.println("Dime un numero del 1 al 10");
       int number = teclado.nextInt();
       System.out.println();
       return number;

     }

     private static void gueesRoll(int random){
      int userNumber = getDataByScanner();
      String message = "Fallaste el numeri era el : "+ random;

      if( userNumber == random){
         message = " Muy bien has adivinado";
      }
      System.out.println(message);
     }

     private static void gueesRoll2(int random){
      int userNumber = getDataByScanner();

      String message= (userNumber == random)?
      "Muy bien, acertaste " + userNumber:
      "Falleste, el numero era : " + random;

      System.out.println();

     }

    public static void main(String[] args) {
        
         Random rd = new Random();
         int random = rd.nextInt(9)+ 1;
      //   gueesRoll(random);
         gueesRoll2(random);
         

       




    }
    
}
