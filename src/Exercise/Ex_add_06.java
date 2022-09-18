package Exercise;

import java.util.Scanner;

public class Ex_add_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert square's size: ");
        int size = scanner.nextInt();
        System.out.println("Insert symbol [!, @, #, ..., )]");
        String sym = scanner.next();
        makeSquare(size, sym);
    }

    public static void makeSquare(int size, String s) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == (size - 1)) {
                    System.out.printf("%s ", s);
                } else if (j == 0) {
                    System.out.printf("%s", s);
                } else if (j == (size - 1)) {
                    System.out.printf("%s", s);
                } else if (j == counter) {
                    System.out.printf(" %s ", s);
                } else {
                    System.out.print("  ");
                }
            }
            counter++;
            System.out.println();
        }
    }


}
