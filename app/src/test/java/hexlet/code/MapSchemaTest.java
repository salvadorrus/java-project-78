package hexlet.code;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class MapSchemaTest {

    @Test
    public void mapSchemaTest() {
        var v = new Validator();
        var schema = v.map();

        assertTrue(schema.isValid(null));
        assertFalse(schema.required().isValid(null));

        var mapTest1 = new HashMap<>();
        mapTest1.put("key", "value");

        assertTrue(schema.sizeof(1).isValid(mapTest1));
        assertFalse(schema.sizeof(2).isValid(mapTest1));
        assertTrue(schema.required().sizeof(1).isValid(mapTest1));
    }

}
