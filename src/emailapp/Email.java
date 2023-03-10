package emailapp;

import java.util.Scanner;

public class Email{
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //C0nstructor to receive the first name and last name
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("EMAIL IS CREATED "+ this.firstName+ " " +this.lastName);

        // Call a method to ask for department - return the department
        this.department=setDepartment();
        System.out.println("Department:"+this.department);
    }

    //Askin for department
    private String setDepartment(){
        System.out.println("Department codes \n1 for Sales\n2 for Development\n3 for Acoounting\n0 for none\n PLease enter the department code:");
        Scanner in = new Scanner(System.in);
        int depChoice=in.nextInt();
        if (depChoice==1) {return "sales";}
        else if (depChoice==2) {return "dev";}
        else if (depChoice==3) {return "acct";}
        else {return "";}
    }

    //Generating a random password

    // Setting the mailbox Capacity

    //Setting the alternate mail

    //CHanining the password

}