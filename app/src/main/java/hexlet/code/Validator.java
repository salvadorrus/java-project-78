package hexlet.code;

//import lombok.Data;

//@Data
public class Validator {


    public StringSchema string() {
        return new StringSchema();
    }

    public NumberSchema number() {
        return new NumberSchema();
    }
}
