package analyzer.core;

public class DocumentProcessor {

    public String[] prosesDokumen(String[] dokumen) {
        String[] hasil = new String[dokumen.length];

        for (int i = 0; i < dokumen.length; i++) {
            String teks = dokumen[i].toLowerCase().replaceAll("[^a-z ]", "");
            hasil[i] = teks;
        }

        return hasil;
    }
}