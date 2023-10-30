package org.example;

import org.junit.jupiter.api.Test;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "abcdefgh";
    }
}
