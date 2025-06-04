import java.util.Scanner;

public class Greetings {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //Permite leer entradas del Usuario: Ejemplo numero, texto.
        Scanner teclado = new Scanner(System.in);
        //declarar variables 
        String name;
        int age;
        
        System.out.println("Escribe tu nombre");
        name = teclado.nextLine();
        System.out.println("Escribe tu edad");
        age = teclado.nextInt();

        System.out.println("Hola " + name + " Tienes la Edad de: " + age + " Años");
        teclado.close();
    }

}
