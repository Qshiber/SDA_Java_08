package Exercise;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
6. Napisz program, który zwraca w postaci tablicy zbiór wszystkich liczb mniejszych od zadanej przez użytkownika liczby oraz:
a) Podzielnych przez 2
b) Podzielnych przez 3
c) Podzielnych przez zadaną przez użytkownika liczbę

od 0!
 */
public class Exercise_07 {

    public static void main(String[] args) {

        System.out.println("Insert positive integer: ");
        int usersNumber = getNumberFromUserInput();
        System.out.println("Insert number to divide by: ");
        int userNumDiv = getNumberFromUserInput();
        System.out.printf("Numbers divisible by 2: %s\n", numbersArray(usersNumber, 2));
        System.out.printf("Numbers divisible by 3: %s\n", numbersArray(usersNumber, 3));
        System.out.printf("Numbers divisible by %d: %s\n", userNumDiv, numbersArray(usersNumber, userNumDiv));


    }

    public static int getNumberFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
            //@todo prohibit user from inputting negative numbers
//            if (userInput < 0){
//                System.err.println("Please insert positive integer!");
//                return getNumberFromUserInput();
//            }
        } catch (InputMismatchException exception) {
            System.err.println("That's not a number!");
            return getNumberFromUserInput();
        }
    }

    private static List<Integer> numbersArray(int usersNumber) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= usersNumber; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % usersNumber == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    private static List<Integer> numbersArray(int usersNumber, int number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= usersNumber; i++) {
            if (i % number == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }

//    private static int countNumbers(int[] numbers, int userInput){
//        int counter = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0 || numbers[i] % 3 == 0 || numbers[i] % userInput == 0){
//                counter++;
//            }
//        }
//        return counter;
//    }

}
