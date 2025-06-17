public class Matrix {

    static void vactor() {

        int[] vectorNumbers = { 3, 4, 5, 23, 54 };
        String[] vectorNames = new String[4];

        vectorNames[0] = "Evelyn";
        vectorNames[1] = "Roldan";
        vectorNames[3] = "Ana";

        for (int i = 0; i < vectorNumbers.length; i++) {
            System.out.println(vectorNames[i]);

        }

        for (String name : vectorNames) {
            System.out.println(name);
        }

    }

    static void matrix() {
        int[][] matrixNumbers = new int[3][3];

        matrixNumbers[0][0] = 22;
        matrixNumbers[0][1] = 44;
        matrixNumbers[0][2] = 50;
        matrixNumbers[1][0] = 25;
        matrixNumbers[1][1] = 46;
        matrixNumbers[1][2] = 57;
        matrixNumbers[2][0] = 13;
        matrixNumbers[2][1] = 5;
        matrixNumbers[2][2] = 0;

        for (int i = 0; i < matrixNumbers.length; i++) {
            for (int j = 0; j < matrixNumbers.length; j++) {

                System.out.print(matrixNumbers[i][j] + " \t");

            }
            System.out.println(" ");
        }
        // 
        for (int[] row : matrixNumbers) {
            for (int item : row) {
                System.out.print(item + " \t");
            }
            System.out.println("");

        }

    }

    static void matrix2(){
        String[][] matrixNames= {{"Evelyn", "Roldan", "Lissy",},
                                 {"Wilson", "Keylyn", "Jessy"},
                                 {"Jonathan", "Delmer", "Carlos"}};

    }
    public static void main(String[] args) {
        matrix();

    }
}