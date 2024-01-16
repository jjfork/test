import generators.PasswordGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PasswordGeneratorTests {

    @Test
    public void testGenerateRandomPassword_length8() {
        String password = PasswordGenerator.generateRandomPassword(8);
        assertThat(password.length()).isEqualTo(8);
    }

    @Test
    public void testGenerateRandomPassword_length12() {
        String password = PasswordGenerator.generateRandomPassword(12);
        assertThat(password.length()).isEqualTo(12);
    }

    @Test
    public void testGenerateRandomPassword_length16() {
        String password = PasswordGenerator.generateRandomPassword(16);
        assertThat(password.length()).isEqualTo(16);
    }

    @Test
    public void testGenerateRandomPassword_length0() {
        String password = PasswordGenerator.generateRandomPassword(0);
        assertThat(password).isEmpty();
    }

    @Test
    public void testGenerateRandomPassword_lengthNegative() {
        String password = PasswordGenerator.generateRandomPassword(-5);
        assertThat(password).isEmpty();
    }
}