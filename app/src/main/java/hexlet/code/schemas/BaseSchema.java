package hexlet.code.schemas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class BaseSchema<T> {
    private final Map<String, Predicate<Object>> predicateMap = new HashMap<>();

    public void readPredicate(String type, Predicate<Object> predicate) {
        predicateMap.put(type, predicate);
    }

    public boolean isValid(Object object) {
        return predicateMap.values().stream().allMatch(predicate -> predicate.test(object));
    }
}
