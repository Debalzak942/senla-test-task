package com.company.sixth;

import java.util.ArrayList;
import java.util.List;

class Backpack {

    private final int capacity;
    private List<BackpackItem> items = new ArrayList<>();
    private int totalWeight;
    private int totalPrice;

    Backpack(int capacity) {
        this.capacity = capacity;
    }

    void setItems(List<BackpackItem> items) {
        this.items = items;
        totalPrice = Utils.calculateTotalPrice(items);
        totalWeight = Utils.calculateTotalWeight(items);
    }

    List<BackpackItem> getItems() {
        return items;
    }

    int getCapacity() {
        return capacity;
    }

    int getTotalWeight() {
        return totalWeight;
    }

    int getTotalPrice() {
        return totalPrice;
    }
}
