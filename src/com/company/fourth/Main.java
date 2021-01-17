package com.company.fourth;

import java.util.Scanner;

class Main {

    /*
    Создать программу, которая подсчитывает
    сколько раз употребляется слово в тексте (без учета регистра).
    Текст и слово вводится вручную.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String enteredText = scanner.nextLine().toLowerCase();
        System.out.println("Введите проверяемое слово:");
        String checkedWord = scanner.nextLine().toLowerCase();
        String[] singleWords = enteredText.split(" ");
        int count = 0;
        for (String s : singleWords) {
            if (s.equals(checkedWord)) {
                count++;
            }
        }
        System.out.println("Слово \"" + checkedWord + "\" повторяется " + count + " раз(а)");
    }
}

