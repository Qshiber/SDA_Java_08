package Exercise;
/* 1. Kwadrat pusty w środku (wyłącznie krawędzie).
* * * *
*     *
*     *
* * * *

1. Jeżeli i = 0 i i = size -1 wypisz same "* "
2. Else

 */


import java.util.Scanner;

public class Ex_add_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert square's size: ");
        int size = scanner.nextInt();
        System.out.println("Insert symbol [!, @, #, ..., )]");
        String sym = scanner.next();
        makeSquare(size, sym);
    }

    public static void makeSquare(int size, String s){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == (size - 1)){
                    System.out.printf("%s ", s);
                } else if (j == 0) {
                    System.out.printf("%s", s);
                } else if (j == (size-1)){
                    System.out.printf(" %s", s);
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


}
