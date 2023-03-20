package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> objects, int elements) {
        return objects.stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .limit(elements)
                .map(Object::toString)
                .collect(Collectors.toList());
    }
}
// END
