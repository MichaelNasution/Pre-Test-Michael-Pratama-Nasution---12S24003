package analyzer.model;

import java.util.Map;
import java.util.Set;

public class TextAnalysisResult {

    private Map<String, Integer> frekuensiKata;
    private Map<String, Set<String>> relasiKata;

    public TextAnalysisResult(Map<String, Integer> frekuensiKata, Map<String, Set<String>> relasiKata) {
        this.frekuensiKata = frekuensiKata;
        this.relasiKata = relasiKata;
    }

    public Map<String, Integer> getFrekuensiKata() {
        return frekuensiKata;
    }

    public Map<String, Set<String>> getRelasiKata() {
        return relasiKata;
    }
}