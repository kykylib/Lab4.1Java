package liberman;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class TestDecoder {
    private Decoder decoder;

    @BeforeEach
    public void setUp() {
        decoder = new Decoder();
    }
    @Test
    public void testOnRegister(){
        Decoder decoder = new Decoder();
        String checkPalindrome = decoder.checkPalindrome("Kak");
        assertEquals("Kak",checkPalindrome);
    }
    @Test
    public void testOnSpace(){
        Decoder decoder = new Decoder();
        String checkPalindrome = decoder.checkPalindrome("K ak");
        assertEquals("Kak",checkPalindrome);
    }
}
