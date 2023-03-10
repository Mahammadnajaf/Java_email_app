package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 9;
    private String companySuffix = "azerbaijanioil.com";

    private String alternateEmail;

    //C0nstructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method to ask for department - return the department
        this.department = setDepartment();

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("YOur password is " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    //Askin for department
    private String setDepartment() {
        System.out.println("New Worker:"+firstName +" Department codes \n1 for Sales\n2 for Development\n3 for Acoounting\n0 for none\n PLease enter the department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    //Generating a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMOPQRSTU0123456789!@#";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Setting the mailbox Capacity
    public void SetMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Setting the alternate mail
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }

    //CHanining the password
    public void changePassword(String password){
        this.password=password;
    }
    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    public String showInfo() {
        return "DISPLAY NAME: "+firstName+" "+lastName+
                "\nCOMPANY EMAIL "+email+
                "\nMAILBOX CAPACITY "+mailboxCapacity+"mb";

    }
}
