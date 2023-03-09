package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> wordsMap = new HashMap<>();
        if (sentence.equals("")) {
            return new HashMap<>();
        }

        for (String word : words) {
            int count = wordsMap.getOrDefault(word, 0);
            count += 1;
            wordsMap.put(word, count);
        }
        return wordsMap;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.size() == 0) {
            return "{}";
        }
        StringBuilder mapToString = new StringBuilder("{" + "\n");
        for (String word : map.keySet()) {
            mapToString.append("  ").append(word).append(": ").append(map.get(word)).append("\n");
        }
        mapToString.append("}");
        return String.valueOf(mapToString);
    }
}

//END
