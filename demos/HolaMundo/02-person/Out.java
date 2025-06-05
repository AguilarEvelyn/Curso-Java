// Formas de imprimir en pantalla 
// guardándolo previamente en una variable 
public class Out {
    @SuppressWarnings("un
    used")
    public static void main(String[] args) {
        String name = "Evelyn";
        String surname = "Aguilar";
        int age = 27;

        System.out.println("Hola " + name + " " + surname + "\n¿Como estas a tus? " + age + "años");

       // printf -> expresion, variables..
        System.out.printf("Hola %s %s\n¿como estas a tus %d años\n? ", name, surname, age);

        // println -> templete string

        System.out.println("""
                Hola %s %s
                ¿Como estas a tus %s años?
                """.formatted(name, surname, age));
    }

}
