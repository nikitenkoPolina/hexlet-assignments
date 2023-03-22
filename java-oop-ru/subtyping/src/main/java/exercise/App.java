package exercise;

import java.util.Map;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage storageToSwap) {
        // преобразуем объект, реализующей интерфейс KeyValueStorage, в набор пар ключ-значение
        Map<String, String> swapMap =  storageToSwap.toMap();

        for (Map.Entry<String, String> entryKV : swapMap.entrySet()) {
            String key = entryKV.getKey();
            String value = entryKV.getValue();
            storageToSwap.set(value, key);
            storageToSwap.unset(key);
        }
    }
}
// END
