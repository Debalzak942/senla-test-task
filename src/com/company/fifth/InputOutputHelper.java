package com.company.fifth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InputOutputHelper {

    /**
     * @return list of numbers included in the entered range
     */
    static List<Integer> enterNumber() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дана последовательность чисел от 0 до N\nВведите значение N");
        number = scanner.nextInt();
        if (number < 10 && number > 0) {
            System.out.println("В диапазоне от 0 до 10 отсутствуют числа-палиндромы");
        }
        if (number < 0 || number > 100) {
            System.err.println("Необходимо ввести значение в диапазоне от 0 до 100");
            throw new NumberFormatException();
        }
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < number + 1; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    /**
     * @param numbers the numbers are palindromes
     */
    static void printResult(List<Integer> numbers) {
        System.out.println(PalindromeCalculation.findPalindrome(numbers));
    }
}
