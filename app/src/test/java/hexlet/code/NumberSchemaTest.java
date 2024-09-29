package hexlet.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberSchemaTest {

    @Test
    void numberSchemaTest() {
        var v = new Validator();
        var schema = v.number();

        assertTrue(schema.isValid(null));
        assertTrue(schema.positive().isValid(5));
        assertTrue(schema.range(1, 5).isValid(3));
        assertTrue(schema.required().positive().range(1, 5).isValid(3));

        assertFalse(schema.required().isValid(null));
        assertFalse(schema.positive().isValid(-5));
        assertFalse(schema.range(1, 5).isValid(6));

    }

}
