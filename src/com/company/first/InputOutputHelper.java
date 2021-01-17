package com.company.first;

import java.util.Scanner;

class InputOutputHelper {

    /**
     @return the entered number if it meets the specified conditions
     */
    static int enterNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int userInput = 0;
        try {
            String s = in.nextLine();
            userInput = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.err.println("Не соответствует условиям ввода.");
            System.exit(0);
        }
        return userInput;
    }

    /**
     * @param number the number that you want to display information about
     */
    static void printResult(int number) {
        NumberInformation numberInformation = new NumberInformation();
        System.out.println(numberInformation.getNumberInformation(number));
    }
}
