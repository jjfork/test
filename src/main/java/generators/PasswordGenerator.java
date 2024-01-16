package generators;

public class PasswordGenerator {

    public static String generateRandomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%^&*()";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
