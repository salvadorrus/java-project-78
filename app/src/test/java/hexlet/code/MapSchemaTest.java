package hexlet.code;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class MapSchemaTest {

    @Test
    public void mapSchemaTest() {
        var v = new Validator();
        var schema = v.map();

        assertTrue(schema.isValid(null));
        assertFalse(schema.required().isValid(null));

        var mapTest = new HashMap<>();
        mapTest.put("key", "value");

        assertTrue(schema.sizeof(1).isValid(mapTest));
        assertFalse(schema.sizeof(2).isValid(mapTest));
        assertTrue(schema.required().sizeof(1).isValid(mapTest));
    }

    @Test
    public void shapeTest() {

        var v = new Validator();
        var schema = v.map();

        Map<String, BaseSchema<String>> mapTests = new HashMap<>();
        mapTests.put("key1", v.string().required());
        mapTests.put("key2", v.string().required().minLength(2));
        schema.shape(mapTests);

        Map<String, String> mapTest2 = new HashMap<>();
        mapTest2.put("key1", "value1");
        mapTest2.put("key2", "value2");
        assertTrue(schema.isValid(mapTest2));

        Map<String, String> mapTest3 = new HashMap<>();
        mapTest3.put("key1", "value1");
        mapTest3.put("key2", null);
        assertFalse(schema.isValid(mapTest3));

        Map<String, String> mapTest4 = new HashMap<>();
        mapTest4.put("key1", "value1");
        mapTest4.put("key2", "v");
        assertFalse(schema.isValid(mapTest4));
    }

}
