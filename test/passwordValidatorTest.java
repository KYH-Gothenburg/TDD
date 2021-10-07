import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Min length: 8 characters
// Mix of upper and lower case
// At least one digit

public class passwordValidatorTest {
    @Test
    public void testValidPasswordLength() {
        boolean result = Main.passwordValidator("abcd1Efghi");
        assertTrue(result);
    }

    @Test
    public void testInvalidPasswordLength() {
        boolean result = Main.passwordValidator("Abc1");
        assertFalse(result);
    }

    @Test
    public void testHasBothUpperAndLower() {
        boolean result = Main.passwordValidator("aBcDefgH2i");
        assertTrue(result);
    }

    @Test
    public void testHasNoUpperAndLower() {
        boolean result = Main.passwordValidator("123123123123");
        assertFalse(result);
    }

    @Test
    public void testHasDigit() {
        boolean result = Main.passwordValidator("aBcDe74fgHi");
        assertTrue(result);
    }

    @Test
    public void testHasNoDigit() {
        boolean result = Main.passwordValidator("aBcDejsfgHi");
        assertFalse(result);
    }
}
