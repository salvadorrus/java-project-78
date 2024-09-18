package hexlet.code;

public class StringSchema {
    public static String stringSchema(String string) {
        var v = new Validator(string);
        return v.string();
    }
}
