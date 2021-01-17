package com.company.second;

class Calculation {

    /**
     * Calculates greatest common divisor
     * @param firstNumber
     * @param secondNumber
     * @return greatest common divisor
     */
    static int countNOD(int firstNumber, int secondNumber) {
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        }
        return firstNumber + secondNumber;
    }

    /**
     * Calculates smallest common multiple
     * @param firstNumber
     * @param secondNumber
     * @return smallest common multiple
     */
    static int countNOK(int firstNumber, int secondNumber) {
        int result = -1;
        try {
            result = (firstNumber * secondNumber) / countNOD(firstNumber, secondNumber);
            if (result < 0) {
                System.err.println("НОК превышает максимально допустимое значение");
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return result;
    }
}
