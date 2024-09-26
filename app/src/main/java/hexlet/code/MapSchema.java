package hexlet.code;

import java.util.Map;
import java.util.Objects;

public class MapSchema<K, V> extends BaseSchema<Map<K, V>> {

    public MapSchema<K, V> required() {
        readPredicate("required", Objects::nonNull);
        return this;
    }

    public MapSchema<K, V> sizeof(Integer number) {
        readPredicate("sizeof", value -> ((Map<?, ?>) value).size() == number);
        return this;
    }

    public MapSchema<K, V> shape(Map<K, BaseSchema<V>> schema) {
        readPredicate("shape", value -> schema.entrySet().stream().allMatch(item -> {
                    Object object = ((Map<?, ?>) value).get(item.getKey());
                    return item.getValue().isValid(object);
                })
        );
        return this;
    }
}
