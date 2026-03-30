package analyzer.core;

import java.util.*;

public class RelationAnalyzer {

    public Map<String, Set<String>> bangunRelasi(String[] dokumen) {
        Map<String, Set<String>> relasi = new HashMap<>();

        for (String doc : dokumen) {
            String[] kataArray = doc.split(" ");

            for (String kata1 : kataArray) {
                relasi.putIfAbsent(kata1, new HashSet<>());

                for (String kata2 : kataArray) {
                    if (!kata1.equals(kata2)) {
                        relasi.get(kata1).add(kata2);
                    }
                }
            }
        }

        return relasi;
    }

    public String cariRelasiTerbanyak(Map<String, Set<String>> relasi) {
        String hasil = "";
        int max = 0;

        for (String kata : relasi.keySet()) {
            int ukuran = relasi.get(kata).size();

            if (ukuran > max) {
                max = ukuran;
                hasil = kata;
            }
        }

        return hasil;
    }
}