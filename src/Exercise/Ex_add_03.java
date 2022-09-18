package Exercise;

//3. Literę „L", o krawędziach równej długości.

import java.util.Scanner;

public class Ex_add_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert L size: ");
        int size = scanner.nextInt();
        System.out.println("Insert symbol: ");
        String sym = scanner.next();
        makeL(size, sym);

    }

    public static void makeL(int size, String s){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0) {
                    System.out.printf("%s ", s);
                } else if (i == (size - 1)){
                    System.out.printf("%s ", s);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
