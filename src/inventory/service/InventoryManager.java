package inventory.service;

import inventory.model.Item;

import java.util.*;

public class InventoryManager {

    public List<Item> konversi(String[][] data) {
        List<Item> list = new ArrayList<>();

        for (String[] d : data) {
            list.add(new Item(
                    d[0],
                    d[1],
                    d[2],
                    Integer.parseInt(d[3]),
                    Integer.parseInt(d[4])
            ));
        }

        return list;
    }

    public Map<String, List<Item>> grouping(List<Item> items) {
        Map<String, List<Item>> map = new HashMap<>();

        for (Item item : items) {
            map.putIfAbsent(item.getKategori(), new ArrayList<>());
            map.get(item.getKategori()).add(item);
        }

        return map;
    }
}