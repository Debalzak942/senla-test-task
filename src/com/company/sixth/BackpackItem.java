package com.company.sixth;

class BackpackItem {

    private int price;
    private int weight;
    private String name;

    BackpackItem(int price, int weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    int getPrice() {
        return price;
    }

    int getWeight() {
        return weight;
    }

    String getName() {
        return name;
    }
}
