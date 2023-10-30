package org.example;

public class User {
    private String Password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        String password = passwordGenerator.generatePassword();
        /*
         *
         */
        if(password.length() >= 8 && password.length() <= 12) {
            this.Password = password;
        }
    }

    public String getPassword() {
        return Password;
    }
}
