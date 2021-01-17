package com.company.second;

class ReadNumbers {

    private final int firstNumber;
    private final int secondNumber;

    ReadNumbers(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    int getFirstNumber() {
        return firstNumber;
    }

    int getSecondNumber() {
        return secondNumber;
    }
}