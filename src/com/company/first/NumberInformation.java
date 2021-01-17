package com.company.first;

class NumberInformation {

    /**
     * Getting information about entered number
     * @param userInput the entered number
     * @return even/odd, as well simple/composite
     */
    String getNumberInformation(int userInput) {
        String numberIs = "Число является ";
        if (isPrime(userInput)) {
            numberIs = numberIs.concat("простым и ");
        } else if (isComposite(userInput)) {
            numberIs = numberIs.concat("составным и ");
        }
        if (isEven(userInput)) {
            numberIs = numberIs.concat("четным");
        } else {
            numberIs = numberIs.concat("нечетным");
        }
        return numberIs;
    }

    /**
     * @param number the entered number
     * @return true if number is even
     */
    boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * @param number the entered number
     * @return true if number is prime
     */
    boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int userInputSquareRoot = (int) Math.sqrt(number);

        for (int i = 2; i <= userInputSquareRoot; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * @param number the entered number
     * @return true if number is composite
     */
    boolean isComposite(int number) {
        if (number < 2) {
            return false;
        }
        int userInputSquareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= userInputSquareRoot; i++) {
            if (number % i == 0){
                return true;
            }
        }
        return false;
    }
}
