package com.company.second;

class Main {

    /*
    Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное) и
    НОД (наибольший общий делитель) двух целых чисел, введенных пользователем.
    Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
     */
    public static void main(String[] args) {
        ReadNumbers readNumbers = InputOutputHelper.enterNumbers();
        int nod = Calculation.countNOD(readNumbers.getFirstNumber(),
                readNumbers.getSecondNumber());
        int nok = Calculation.countNOK(readNumbers.getFirstNumber(),
                readNumbers.getSecondNumber());
        InputOutputHelper.printResult(nod, nok);
    }
}
