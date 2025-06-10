
public class OutResults{
    public static void main(String[] args) {
        String name = "Evelyn";
        String surname = "Aguilar";
        int age = 27;

        String result= "Hola " + name + " " + surname + "\n¿Como estas a tus? " + age + "años";

        System.out.println(result);

       // printf -> expresión, variables..
        System.out.printf("Hola %s %s\n¿como estas a tus %d años\n? ", name, surname, age);

        // println -> templete string

        System.out.println("""
                Hola %s %s
                ¿Como estas a tus %s años?
                """.formatted(name, surname, age));
    }

}
