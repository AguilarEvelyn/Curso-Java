import java.util.Scanner;

public class Calculator {

    // suma
    static int add(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
    // resta

    static int subtraction(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    // Multiplicación
    static int multiply(int num1, int num2) {
        int multiplicar = num1 * num2;
        return multiplicar;

    }

    // Division

    static double split(double a, double b) {
        double dividir = a / b;
        return a / b;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
         
        System.out.println("Introduce El primer numero: ");
         int num1= teclado.nextInt();
         double a= teclado.nextDouble();

         System.out.println("Introduce el segundo numero");
         int num2= teclado.nextInt();
         double b = teclado.nextDouble();

         System.out.println("La suma es: " + add(num1, num2));
         System.out.println("La Resta es: " + subtraction(num1, num2));
         System.out.println("La multiplicación es: " + multiply(num1,num2));
         System.out.println("La division es:" + split(a, b));
    }

}