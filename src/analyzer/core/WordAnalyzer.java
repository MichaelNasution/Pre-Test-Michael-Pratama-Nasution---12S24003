package analyzer.core;

import java.util.HashMap;
import java.util.Map;

public class WordAnalyzer {

    public Map<String, Integer> hitungFrekuensi(String[] dokumen) {
        Map<String, Integer> frekuensi = new HashMap<>();

        for (String doc : dokumen) {
            String[] kataArray = doc.split(" ");

            for (String kata : kataArray) {
                frekuensi.put(kata, frekuensi.getOrDefault(kata, 0) + 1);
            }
        }

        return frekuensi;
    }
}