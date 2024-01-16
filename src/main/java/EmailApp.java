public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Joe", "Doe");
        System.out.println(email.showInfo());
        email.setAlternativeEmail("test@test.com");
        email.setMailboxCapacity(1000);
        System.out.println(email.showInfo());
    }
}
