package Exercise;
//2. Prostokąt pusty w środku.

import java.util.Scanner;

public class Ex_add_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert width: ");
        int width = scanner.nextInt();
        System.out.println("Insert height: ");
        int height = scanner.nextInt();
        System.out.println("Insert symbol [!, @, #, ..., )]");
        String sym = scanner.next();
        makeRectangle(width,height, sym);

    }

    public static void makeRectangle(int width, int height, String s){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == (height - 1)){
                    System.out.printf("%s ", s);
                } else if (j == 0) {
                    System.out.printf("%s", s);
                } else if (j == (width-1)){
                    System.out.printf(" %s", s);
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
