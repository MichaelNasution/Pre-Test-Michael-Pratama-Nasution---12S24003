package inventory.main;

import inventory.model.Item;
import inventory.service.*;

import java.util.*;

public class InventoryApp {

    public static void main(String[] args) {

        String[][] data = {
                {"B01", "Laptop", "Elektronik", "5", "80"},
                {"B02", "Kursi", "Furniture", "10", "60"},
                {"B03", "HP", "Elektronik", "8", "90"},
                {"B04", "Meja", "Furniture", "3", "70"}
        };

        InventoryManager im = new InventoryManager();
        PriorityManager pm = new PriorityManager();

        List<Item> items = im.konversi(data);

        pm.updatePrioritas(items);

        System.out.println("Setelah Update Priority:");
        for (Item item : items) {
            System.out.println(item.getId() + " -> " + item.getPrioritas());
        }

        pm.sorting(items);

        System.out.println("\nSorted Items:");
        for (Item item : items) {
            System.out.print(item.getId() + " ");
        }

        Map<String, List<Item>> map = im.grouping(items);

        System.out.println("\n\nKategori dengan priority tertinggi:");
        System.out.println(pm.kategoriTertinggi(map));
    }
}