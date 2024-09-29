import hexlet.code.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringSchemaTest {
    @Test
    public void stringSchemaTest() {
        var v = new Validator();
        var schema = v.string();

        assertTrue(schema.isValid(null));
        assertTrue(schema.minLength(3).isValid("hex"));
        assertTrue(schema.contains("hex").isValid("hexlet"));
        assertTrue(schema.required().minLength(6).contains("hex").isValid("hexlet"));

        assertFalse(schema.required().isValid(null));
        assertFalse(schema.minLength(5).isValid("hex"));
        assertFalse(schema.contains("abc").isValid("hexlet"));
    }
}
