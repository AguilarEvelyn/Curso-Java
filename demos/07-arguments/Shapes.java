

public class Shapes {

  // declara la funcion
  static double calculateArea(double side) {
    return side * side;
  }

  // calcular l area 

  static double calculateRectangle( double base, double height ){
    return base * height
;
  }

  static double calculateArea(double base, double height, boolean isTriangle){
    return( base * height) /2;
  }

  public static void main(String[] args) {
    // Invocación (Llamar)

   System.out.println(calculateArea(2));
   System.out.println(calculateRectangle(2,5));
   System.out.println(calculateArea(2,5,true));

  }

}
