//import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringSchemaTest {
    private  static String string;
    private  String expected;

//    @BeforeAll
//    public static void beforeAll() {
//        var string = "what does the fox say";
//        var expected = "";
//    }

    public static void schemaTest() {
        var result = "what does the fox say";
        assertEquals(result, string);
    }

}
