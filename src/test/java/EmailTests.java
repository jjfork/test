import generators.Email;
import generators.PasswordGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmailTests {

    @Mock
    private PasswordGenerator passwordGenerator;

    private Email email;

    @BeforeEach
    public void setup() {
        email = new Email("John", "Doe");
    }

    @Test
    public void testSetMailboxCapacity() {
        email.setMailboxCapacity(1000);
        assertEquals(1000, email.getMailboxCapacity());
    }

    @Test
    public void testSetAlternativeEmail() {
        email.setAlternativeEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", email.getAlternativeEmail());
    }

    @Test
    public void testChangePassword() {
        email.changePassword("newPassword");
        assertEquals("newPassword", email.getPassword());
    }

    @Test
    public void testShowInfo() {
        String expectedInfo = "\nDISPLAY NAME: John Doe" +
                "\nCOMPANY EMAIL: john.doe" + email.getDepartment().toUpperCase() + "@company.com" +
                "\nMAILBOX CAPACITY: 500mb";
        assertEquals(expectedInfo, email.showInfo());
    }

    @Test
    public void testGenerateEmail() {
        assertEquals("john.doe" + email.getDepartment().toUpperCase() + "@company.com", email.getEmail());
    }

    @Test
    public void testSetDepartment() {
        when(passwordGenerator.generateRandomPassword(10)).thenReturn("randomPassword");
        email = new Email("John", "Doe");
        assertEquals("randomPassword", email.getPassword());
    }
}