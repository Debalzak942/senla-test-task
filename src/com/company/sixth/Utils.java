package com.company.sixth;

import java.util.List;

class Utils {

    static int calculateTotalWeight(List<BackpackItem> items) {
        int result = 0;
        for (BackpackItem item : items) {
            result += item.getWeight();
        }
        return result;
    }

    static int calculateTotalPrice(List<BackpackItem> items) {
        int result = 0;
        for (BackpackItem item : items) {
            result += item.getPrice();
        }
        return result;
    }
}
