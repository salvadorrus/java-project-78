package hexlet.code.schemas;

public final class StringSchema extends BaseSchema<String> {

    public StringSchema required() {
        readPredicate("required", value -> (value != null) && !((String) value).isEmpty());
        return this;
    }

    public StringSchema minLength(int minNumber) {
        readPredicate("minLength", value -> ((String) value).length() >= minNumber);
        return this;
    }

    public StringSchema contains(String specificLine) {
        readPredicate("contains", value -> ((String) value).contains(specificLine));
        return this;
    }
}
