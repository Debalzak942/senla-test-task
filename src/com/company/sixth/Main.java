package com.company.sixth;

import java.io.File;
import java.util.List;

class Main {

    /*
    Имеется набор вещей, которые необходимо поместить в рюкзак.
    Рюкзак обладает заданной грузоподъемностью.
    Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
    Цель задачи заполнить рюкзак не превысив его грузоподъемность и
    максимизировать суммарную ценность груза.
     */
    private static final String FILENAME = "items.json";

    public static void main(String[] args) {
        List<BackpackItem> items = JsonParser.parse(new File(FILENAME));
        Optimizer optimizer = new Optimizer();
        Backpack backpack = optimizer.optimize(items, new Backpack(500));
        printBackpackInfo(backpack);
    }

    private static void printBackpackInfo(Backpack backpack) {
        System.out.println("Список вещей:");
        for (BackpackItem item : backpack.getItems()) {
            System.out.println(item.getName());
        }
        System.out.printf("%s: %s%n", "Суммарная стоимость содержимого", backpack.getTotalPrice());
        System.out.printf("%s: %s%n", "Суммарный вес содержимого", backpack.getTotalWeight());
    }
}

