public class Mammals {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        byte age; // declaracion de variable
        age = 25;

        short year;
        year = 2005;

        int city = 6_000_000;

        long country = 30_000_000;

        float height = 1.7f;

        double weight = 2.4;

        boolean haspet = true;

    

        String name = "(Delphinus delphis)";

        System.out.println("""
                                Edad %s
                                Año %s
                                Ciudad y Poblacion %s
                                Pais y Poblacion %s
                                Altura %s
                                Peso %s
                                ¿Has comprado un Delfin? %s
                                 Nombre %s
                """.formatted(age, year, city, country,  height, weight, haspet, name));
    }

}
