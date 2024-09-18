package hexlet.code;

import lombok.NonNull;

public class StringSchema extends Validator {
    @NonNull
    private final String string = string();


    public String required() {
        return string;
    }

    public String minLength(int minNumber) {
        var maxNumber = string.length();
//        var maxNumber = string.length();
//        return maxNumber >= minNumber;
        if (maxNumber < minNumber) {
            return null;
        } else {
            return string;
        }
    }

    public boolean contains(String specificLine) {
        return string.contains(specificLine);
    }
}
