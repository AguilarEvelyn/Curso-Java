/*
 * Operadores -> expresiones
 * 
 * Asignación 
 *      =
 * 
 * Aritméticos
 * 
 *    +
 *    -
 *    *
 *    /
 *    %
 * 
 * comparación -> expresión boolean
 *    ==
 *   equals()
 *    <=
 *    >=
 *  
 */

public class Operators {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 == num2); // igual -> false
        System.out.println(num1 != num2);// distinto o igual -> true
        System.out.println(num1 > num2); // mayor que  -> false 
        System.out.println(num1 < num2);// menor que -> true
        
          String s1 = "Evelyn";
          String s2 = "Pepe";

          System.out.println(s1.equals(s2));
    }

    
}
