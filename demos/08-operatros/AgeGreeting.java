import java.util.Scanner;

public class AgeGreeting {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int age = teclado.nextInt();

        if( age >= 18){
            System.out.println("Eres mayor de Edad");
        }else if(age <= 33){
            System.out.println("Eres Joven");

        }else if(age <= 65){
            System.out.println("Eres Adulto");
        }else{
            System.out.println("Ere Jubilado");
        }
         
    }

    
}
