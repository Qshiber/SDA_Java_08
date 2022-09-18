package Exercise;
/*

Na podstawie zadanych z konsoli wartości oraz znaku (*, $, #...) narysuj:
      4. *Trójkąt prostokątny.
      *
      * *
      *   *
      * * * *


 */


import java.util.Scanner;

public class Ex_add_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Rectangular Triangle size: ");
        int size = scanner.nextInt();
        System.out.println("Insert symbol: ");
        String symbol = scanner.next();
        makeRectTriangle(size, symbol);

    }

    //trójkąt prostokątny, równoramienny
    /*
    LOGIKA:
    1. *        - tylko jedno
    2. * *      - dwa odstęp 0
    3. *   *    - dwa odstęp 1 (dwie spacje)
    4. * * * *  - ostatni wszystkie
     */
    public static void makeRectTriangle(int size, String s) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0) {
                    System.out.printf("%s ", s);
                } else if (i == (size - 1)) {
                    System.out.printf("%s ", s);
                } else if (j == counter) {
                    System.out.printf("%s ", s);
                } else{
                    System.out.print("  ");
                }
            }
            counter++;
            System.out.println();
        }
    }

}