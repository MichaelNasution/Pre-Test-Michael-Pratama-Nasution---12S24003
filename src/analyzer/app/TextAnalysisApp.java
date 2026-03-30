package analyzer.app;

import analyzer.core.*;
import analyzer.model.TextAnalysisResult;

import java.util.Map;
import java.util.Set;

public class TextAnalysisApp {

    public static void main(String[] args) {

        String[] dokumen = {
                "data science is powerful",
                "science and data are related",
                "big data drives science"
        };

        DocumentProcessor dp = new DocumentProcessor();
        WordAnalyzer wa = new WordAnalyzer();
        RelationAnalyzer ra = new RelationAnalyzer();

        String[] hasilProses = dp.prosesDokumen(dokumen);

        Map<String, Integer> frekuensi = wa.hitungFrekuensi(hasilProses);
        Map<String, Set<String>> relasi = ra.bangunRelasi(hasilProses);

        TextAnalysisResult result = new TextAnalysisResult(frekuensi, relasi);

        System.out.println("Frekuensi Kata:");
        for (String kata : result.getFrekuensiKata().keySet()) {
            System.out.println(kata + " = " + result.getFrekuensiKata().get(kata));
        }

        System.out.println("\nRelasi Kata:");
        for (String kata : result.getRelasiKata().keySet()) {
            System.out.println(kata + " -> " + result.getRelasiKata().get(kata));
        }

        System.out.println("\nKata dengan relasi terbanyak:");
        System.out.println(ra.cariRelasiTerbanyak(relasi));
    }
}