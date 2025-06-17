import java.util.Scanner;

public class AskUser {

   static void ask() {

      Scanner scanner = new Scanner(System.in);
      boolean wantContinue = true;
      while (wantContinue) {
         System.out.println("¿Quieres Continuar (S/N) ?");
         String answer = scanner.nextLine();
         if (answer.toLowerCase().equals("n") ||
               answer.toLowerCase().equals("n")) {
            wantContinue = false;
         }

      }

      scanner.close();
      System.out.println("Gracias por todo.");
   }

   static void ask2() {

      Scanner scanner = new Scanner(System.in);
      String answer = "S";

      while (!answer.toLowerCase().equals("n") &&
            answer.toLowerCase().equals("no"));
         System.out.println("¿Quieres continuar? S/N");
   }

   public static void main(String[] args) {
      ask();
      ask2();
   }
}
