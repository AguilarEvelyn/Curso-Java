/*Función: código ejecutable
 * Puede devolver un valor
 * Puedo invocarlo por du nombre
 * Puede recibir valores --> los recoge como parámetro.
 */

public class Functions {
    //Suma
    static int add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("El resultado es: " + result);
         return result;
    }

    //Resta
    static int subtraction (int num1, int num2){
        int  result= num1 - num2;
        return result;

        //return num1 - num2;
    }

    static void  showResult(int result){
      System.out.println("El resultado es: " + result);  
        
    }

    public static void main(String[] args) {
        // los argumentos son los valores que llegaran a los parámetros.
        int result = add(27, 5);
    

        add(345, result);

        //int resultSubtraction = subtraction (23, 56);

        
    }

}
