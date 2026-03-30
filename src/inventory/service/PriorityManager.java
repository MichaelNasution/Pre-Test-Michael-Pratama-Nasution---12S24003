package inventory.service;

import inventory.model.Item;

import java.util.*;

public class PriorityManager {

    public void updatePrioritas(List<Item> items) {
        for (Item item : items) {
            int prioritas = item.getPrioritas();

            if (item.getJumlah() < 5) {
                prioritas += 20;
            }

            if (item.getKategori().equalsIgnoreCase("Elektronik")) {
                prioritas += 10;
            }

            item.setPrioritas(prioritas);
        }
    }

    public void sorting(List<Item> items) {
        items.sort(Comparator
                .comparing(Item::getPrioritas).reversed()
                .thenComparing(Item::getJumlah));
    }

    public String kategoriTertinggi(Map<String, List<Item>> map) {
        String hasil = "";
        int max = 0;

        for (String kategori : map.keySet()) {
            int total = 0;

            for (Item item : map.get(kategori)) {
                total += item.getPrioritas();
            }

            if (total > max) {
                max = total;
                hasil = kategori;
            }
        }

        return hasil;
    }
}