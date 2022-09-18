package Exercise;
/*
1. Kwadrat pusty w środku (wyłącznie krawędzie).
5. *Jak punkt 1, ale najpierw wprowadź wszystkie elementy do tablicy dwuwymiarowej, a dopiero później je wyświetl.
 */


import java.util.Arrays;
import java.util.Scanner;

public class Ex_add_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert square's size: ");
        int size = scanner.nextInt();
        System.out.println("Insert symbol [!, @, #, ..., )]");
        String sym = scanner.next();
        System.out.println(print2DArray(makeSquare(size, sym)));

    }

    public static String[][] makeSquare(int size, String s) {
        String[][] squareArr = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == (size - 1)) {
                    squareArr[i][j] = String.format("%s ", s);
                } else if (j == 0) {
                    squareArr[i][j] = String.format("%s ", s);
                } else if (j == (size - 1)) {
                    squareArr[i][j] = String.format("%s ", s);
                } else {
                    squareArr[i][j] = String.format("  ");
                }
            }
        }
        return squareArr;
    }

    private static String print2DArray(String[][] array) {
        StringBuilder printArr = new StringBuilder();
        for (String[] s1 : array) {
            printArr.append(Arrays.toString(s1)).append("\n");
        }
        return String.valueOf(printArr);
    }

}
