package com.company.sixth;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

class JsonParser {

    /**
     * Reads a set of items from a file as a list of BackpackItem.class
     * @param jsonFile file with set of items
     * @return list of items
     */
    static List<BackpackItem> parse(File jsonFile) {
        List<BackpackItem> items = new ArrayList<>();
        try {
            Type backpackItemType = new TypeToken<ArrayList<BackpackItem>>(){}.getType();
            items = new Gson().fromJson(new FileReader(jsonFile), backpackItemType);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        }
        return items;
    }
}
