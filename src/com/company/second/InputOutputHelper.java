package com.company.second;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputOutputHelper {

    /**
     * @return the entered number if it meets the specified conditions
     */
    static ReadNumbers enterNumbers() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        try {
            System.out.println("Введите первое число: ");
            firstNumber = scanner.nextInt();
            System.out.println("Введите второе число: ");
            secondNumber = scanner.nextInt();
            if (firstNumber <= 0 || secondNumber <= 0) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.err.println("Необходимо ввести простые числа до " + Integer.MAX_VALUE);
            System.exit(0);
        }
        return new ReadNumbers(firstNumber, secondNumber);
    }

    /**
     *
     * @param nod greatest common divisor
     * @param nok smallest common multiple
     */
    static void printResult(int nod, int nok){
        System.out.printf("%s = %s%n", "Наибольший общий делитель", nod);
        System.out.printf("%s = %s%n", "Наименьшее общее кратное", nok);
    }
}
