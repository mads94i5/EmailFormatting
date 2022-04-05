package com.company;

public class EmailFormatting {
    public String[] splitEmail(String email) {
        String[] emailSplits = new String[3];
        int atIndex = 0;
        int dotIndex = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atIndex = i;
            }
            if (email.charAt(i) == '.') {
                if (dotIndex != i-1) {
                    dotIndex = i;
                }
                else {
                    dotIndex = 0;
                }
            }
        }
        if ((atIndex != 0) && (dotIndex != 0)) {
            emailSplits[0] = email.substring(0, atIndex);
            emailSplits[1] = email.substring(atIndex + 1, dotIndex);
            emailSplits[2] = email.substring(dotIndex + 1);
        }
        return emailSplits;
    }

    public boolean checkIfEmail(String email) {
        String[] emailSplits;
        emailSplits = splitEmail(email);
        if ((emailSplits[0] == null) || (emailSplits[1] == null) || (emailSplits[2] == null)) {
            return false;
        } else {
            return true;
        }
    }
}
