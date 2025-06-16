public class ReverseString {

    static String removeFirString(String value) {
        return value;

    }
    static String removeFirstLast(String value) {
        String result = "";
        for (int i = 0; i < value.length(); i++) {
            result = value.charAt(i) + result;

        }
        return result;
    }

    static void countDown() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

    }

    static String removeFirstLast2(String value) {
        String result = "";
        for (int i = 1; i < value.length() - 1; i++) {
            result = value.charAt(i) + result;

        }
        return result;
    }

    public static void main(String[] args) {

        String test = "Prueba";
        String reverse = removeFirString(test);
        String removed = removeFirstLast2(test);
        System.out.println("Original " + test);
        System.out.println("Reverse: " + reverse);
        System.out.println("Recordando: " + removed);
        countDown();

    }

}
