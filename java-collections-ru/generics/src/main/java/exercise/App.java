package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> parameters) {

        List<Map<String, String>> matches = new ArrayList<>();

        for (Map<String, String> book : books) {
            boolean founded = true;
            for (Map.Entry<String, String> pairOfParams : parameters.entrySet()) {
                if (!book.get(pairOfParams.getKey()).equals(pairOfParams.getValue())) {
                    founded = false;
                }
            }
            if (founded) {
                matches.add(book);
            }
        }
        return matches;
    }
}
//END
