package hexlet.code;

import java.util.Objects;

public class NumberSchema extends BaseSchema<Integer> {

    public NumberSchema required() {
        readPredicate("required", Objects::nonNull);
        return this;
    }

    public NumberSchema positive() {
        readPredicate("positive", value -> (value == null) || ((Integer) value) > 0);
        return this;
    }

    public NumberSchema range(int numberOne, int numberTwo) {
        readPredicate("range", value -> value != null && ((Integer) value) >= numberOne
                && ((Integer) value) <= numberTwo);
        return this;
    }
}
