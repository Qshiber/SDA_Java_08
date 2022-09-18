package Exercise;

import java.rmi.ServerError;
import java.util.Scanner;

/*
Napisz funkcje ktora odnajduje pojedynczy znak w Stringu po indexe;

"SuperDuperString" -> index 5 = 'r'
"SuperDuperString" -> index 6 = 'D'
 */
public class Exercise_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Word: ");
        String word = scanner.next();
        System.out.println("Index: ");
        int index = scanner.nextInt();

        System.out.println(getCharAt(word, index));
    }

    public static char getCharAt(String s, int index){
        try {
            return (s.charAt(index - 1));
        } catch (StringIndexOutOfBoundsException exeption){
            System.err.println("Provided value is longer than word");
            return 0;
        }
    }



}
