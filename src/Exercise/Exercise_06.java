package Exercise;

import java.util.Arrays;

/*
Napisz program, który dla zadanej tablicy typu int zwraca:

a) Największą wartość
b) Najmniejszą wartość
c) Sumę wszystkich wartości
d) Wartość średnią

e) Medianę:
Najpierw wypisujemy liczby w kolejności niemalejącej:
−1,1,5,6,6,8,10
Mediana to liczba środkowa. Zatem mediana jest równa 6.

 */
public class Exercise_06 {

    public static void main(String[] args) {

        int[] numberArr = new int[]{-40, 1, 5, 6, -78, 8, 10, 11};
        //testing
//        System.out.println(maxVal(numberArr));
//        System.out.println(minVal(numberArr));
//        System.out.println(sumVal(numberArr));
//        System.out.println(averageVal(numberArr));
        System.out.println(medianVal(numberArr));
        System.out.println(Arrays.toString(numberArr));

    }

    public static int maxVal(int[] numbers) {
        int max;
        if (numbers.length > 0) {
            max = numbers[0];
        } else {
            return 0;
            //@todo wypluć w inny sposób błąd jeśli nie ma numerów
        }
        for (int val : numbers) {
            if (max < val) {
                max = val;
            }
        }
        return max;
    }

    public static int minVal(int[] numbers) {
        int max;
        if (numbers.length > 0) {
            max = numbers[0];
        } else {
            return 0;
            //@todo wypluć w inny sposób błąd jeśli nie ma numerów
        }
        for (int val : numbers) {
            if (max > val) {
                max = val;
            }
        }
        return max;
    }

    public static int sumVal(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static double averageVal(int[] numbers) {
        return (double) sumVal(numbers) / (double) numbers.length;
    }

    public static double medianVal(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers.length % 2 == 1) {
            return numbers[numbers.length / 2];
        } else {
            int pos1 = (int) Math.ceil(numbers.length / 2);
            int pos2 = (int) Math.floor(numbers.length / 2);
            return ((numbers[pos1]+numbers[pos2])/2);
        }
    }


}


