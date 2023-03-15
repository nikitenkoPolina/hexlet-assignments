package exercise;

import java.util.LinkedHashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Map<String, String> dataMap = new LinkedHashMap<>();
        for (String key1 : map1.keySet()) {
            if (map2.containsKey(key1)) { // если ключ присутствовал и в первом и во втором массиве
                if (map2.containsValue(map1.get(key1))) { // с одинаковыми значениями
                    dataMap.put(key1, "unchanged");
                } else { // значения отличаются
                    dataMap.put(key1, "changed");
                }
            } else { // если ключ был в первом массиве, но отсутствует во втором
                dataMap.put(key1, "deleted");
            }
        }
        for (String key2 : map2.keySet()) {
            if (!map1.containsKey(key2)) { // если ключ отсутствовал в первом массиве, но был добавлен во второй
                dataMap.put(key2, "added");
            }
        }
        return dataMap;
    }
}
//END


