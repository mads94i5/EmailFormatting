package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.displayEmailParts("madskristianpedersen89@gmail.com");
        main.displayIfEmail("madskristianpedersen89@gmail.com");
        main.displayIfEmail("madskristianpedersen89@gmail.co.uk");
        main.displayIfEmail("madskristianpedersen89@@gmail.com");
        main.displayIfEmail("madskristianpedersen89@gmail..com");
        main.displayIfEmail("madskristianpedersen89gmail..com");
        main.displayIfEmail("madskristianpedersen89gmail.com");
        main.displayIfEmail("madskristianpedersen89gmailcom");
    }

    public void displayEmailParts(String email) {
        EmailFormatting emailFormat = new EmailFormatting();
        for (String emailPart : emailFormat.splitEmail(email)) {
            System.out.println(emailPart);
        }
    }
    public void displayIfEmail(String email) {
        EmailFormatting emailFormat = new EmailFormatting();
        boolean isEmail = emailFormat.checkIfEmail(email);
        if (isEmail) {
            System.out.println(email + " is an e-mail.");
        } else {
            System.out.println(email + " is not an e-mail.");
        }
    }
}
