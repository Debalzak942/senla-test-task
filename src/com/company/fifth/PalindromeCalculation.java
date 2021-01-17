package com.company.fifth;

import java.util.ArrayList;
import java.util.List;

class PalindromeCalculation {

    /**
     * Calculates the numbers are palindromes
     * @param numberList
     * @return the numbers are palindromes
     */
    static List<Integer> findPalindrome(List<Integer> numberList) {
        List<Integer> palindromeList = new ArrayList<>();
        int remainder;
        int number;
        int originalNumber;
        for (int i : numberList) {
            int sum = 0;
            if (i > 10) {
                number = numberList.get(i);
                originalNumber = number;
                while (number != 0) {
                    remainder = number % 10;
                    sum = sum * 10 + remainder;
                    number = number / 10;
                }
                if (originalNumber == sum) {
                    palindromeList.add(i);
                }
            }
        }
        return palindromeList;
    }
}