import generators.PasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;

    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "company.com";
    private String alternativeEmail;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        Random random = new Random();
        this.department = setDepartment(random.nextInt(3));

        this.password = PasswordGenerator.generateRandomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + department.toUpperCase()+ "@" + companySuffix;
    }

    private String setDepartment(int departmentChoice) {
        if (departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "development";
        } else if (departmentChoice == 3) {
            return "accounting";
        } else {
            return "";
        }

    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "\nDISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}

