package hexlet.code;

import lombok.Data;

@Data
public class Validator {

    private String string;

    public String string() {
        return this.string;
    }
}
