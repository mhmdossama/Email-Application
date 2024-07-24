package email.application;

import java.util.Random;
import java.util.Scanner;

public class User {

    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailBoxCapacity=500;

    private String generatedEmail;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        generateEmail();
        setPassword();
    }

    private String setDepartment(){
        Scanner scanner = new Scanner(System.in);
        int deptNum;

        // Prompt the user for department and show the available codes
        System.out.println("What is your department?");
        System.out.println("Departments Codes\n1 for Sales\n2 for Quality\n3 for Development\n4 for None");

        // Use a while loop to ensure valid input
        while (true) {
            // Read user input
            deptNum = scanner.nextInt();
            if (deptNum >= 1 && deptNum <= 4) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
            }
        }

        switch (deptNum) {
            case 1:
                return "Sales";
            case 2:
                return "Quality";
            case 3:
                return "Development";
            case 4:
                return "None";
            default:
                return "";

    }}

    //Generate an email
    private void generateEmail(){
        this.generatedEmail=(this.firstName+"."+this.lastName+"@"+this.department+".company.com").toLowerCase();
    }

    private void setPassword(){

        final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random =new Random();

        int minLength=5;
        int maxLength=10;

        int length = minLength + random.nextInt(maxLength - minLength + 1);

        StringBuilder text = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            char randomChar = CHARACTERS.charAt(random.nextInt(CHARACTERS.length()));
            text.append(randomChar);
        }
        this.password=text.toString();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public void setGeneratedEmail(String generatedEmail) {
        this.generatedEmail = generatedEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", password='" + password + '\'' +
                ", mailBoxCapacity=" + mailBoxCapacity +
                ", generatedEmail='" + generatedEmail + '\'' +
                '}';
    }
}
 