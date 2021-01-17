package com.company.sixth;

import java.util.ArrayList;
import java.util.List;

class Optimizer {

    private List<BackpackItem> bestCombination = new ArrayList<>();

    /**
     * Fills the backpack with the most optimal combination of items
     * @param items total set of items
     * @param backpack
     * @return the backpack with the most optimal combination of items
     */
    Backpack optimize(List<BackpackItem> items, Backpack backpack) {
        buildPossibleCombinations(items, backpack);
        backpack.setItems(bestCombination);
        return backpack;
    }

    /**
     * Creates a set of possible combinations of items in the backpack
     * @param items verifiable combination of items
     * @param backpack
     */
    private void buildPossibleCombinations(List<BackpackItem> items, Backpack backpack) {
        if (items.size() > 0) {
            checkOptimalBackpack(items, backpack);
        }
        for (int i = 0; i < items.size(); i++) {
            List<BackpackItem> currentCombination = new ArrayList<>(items);
            currentCombination.remove(i);
            buildPossibleCombinations(currentCombination, backpack);
        }
    }

    /**
     * Checking the combination for optimality
     * @param items selected combination of items
     * @param backpack
     */
    private void checkOptimalBackpack(List<BackpackItem> items, Backpack backpack) {
        if (bestCombination.size() == 0) {
            if (Utils.calculateTotalWeight(items) <= backpack.getCapacity()) {
                bestCombination = items;
            }
        } else {
            if (Utils.calculateTotalWeight(items) <= backpack.getCapacity() && Utils.calculateTotalPrice(items) > Utils.calculateTotalPrice(bestCombination)) {
                bestCombination = items;
            }
        }
    }
}
