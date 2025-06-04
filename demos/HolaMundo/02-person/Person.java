
/*  TIPO DE NUMEROS
    * byte= 1byte -128 _ 127 contando el cero
    * shor =2byte
    * int = 4byte
    * long =8byte
    * float = decimal 4 byte
      double = decimal 8 bytes
   */

public class Person {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        byte age; // declaracion de variable
        age = 27; // asignacion de variables

        short birthYear;
        birthYear = 1998;

        int cityPopulation = 4_000_000;

        long countryPopulation = 40_000_000;

        float height = 1.78f;

        double weight = 65.74;

        boolean haspet = true;

        char type = 'R';

        String name = "Evelyn";

        System.out.println("Edad " +  age);
        System.out.println("Fecha de Año "+ birthYear);
        System.out.println("Ciudad Poblacion " + cityPopulation);
        System.out.println( "Pais Poblacion " + countryPopulation);
        System.out.println("Altura "+ height);
        System.out.println( "Peso " + weight);
        System.out.println("""
                ¿Tienes mascotas? %s
                Tipo %s
                Nombre %s
                """.formatted(haspet,type, name));


    }

}
