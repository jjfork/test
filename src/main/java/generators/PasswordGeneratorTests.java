package generators;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class PasswordGeneratorTests {

    @Test
    public void testGenerateRandomPassword_length8() {
        String password = PasswordGenerator.generateRandomPassword(8);
        assertEquals(8, password.length());
    }

    @Test
    public void testGenerateRandomPassword_length12() {
        String password = PasswordGenerator.generateRandomPassword(12);
        assertEquals(12, password.length());
    }

    @Test
    public void testGenerateRandomPassword_length16() {
        String password = PasswordGenerator.generateRandomPassword(16);
        assertEquals(16, password.length());
    }
}