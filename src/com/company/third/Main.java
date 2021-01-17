package com.company.third;

import java.util.Scanner;

class Main {

    /*
    Создать программу, которая будет:
      - подсчитывать количество слов в предложении
      - выводить их в отсортированном виде
      - делать первую букву каждого слова заглавной.
    Предложение вводится вручную. (Разделитель пробел (“ ”)).
     */
    private static final String DIVIDER = " ";  // symbol of the division of words
                                                // in a line according to the problem condition

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String input = scanner.nextLine();
        String[] words = input.split(DIVIDER);
        System.out.printf("%s: %d\n", "Количество слов", words.length);
        for (String word : words) {
            if (!Character.isUpperCase(word.charAt(0))) {
                word = word.replace(word.charAt(0), Character.toUpperCase(word.charAt(0)));
            }
            System.out.println(word);
        }
    }
}
