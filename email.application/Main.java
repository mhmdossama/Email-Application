package email.application;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        User Osama =new User("Mohamed","Ossama");

        System.out.println(Osama);

        Osama.setMailBoxCapacity(90);
        Osama.setGeneratedEmail("ossama@gmail.com");
        Osama.setPassword("12345");

        System.out.println(Osama);

    }
}
