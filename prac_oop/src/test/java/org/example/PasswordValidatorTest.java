package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

/**
 * Password length should be in  8 to 12
 * If the password does not meet requirement, it causes IllegalArgumentException
 * Write test code down about boundary conditions
 */
public class PasswordValidatorTest {
    @DisplayName("If password meet the requirement, it does not cause error")
    @Test
    void validatorPasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("serverwized"))
                .doesNotThrowAnyException();
    }

    @DisplayName("If the length of password is under 8 or over 12, It causes IllegalArgumentException")
    @ParameterizedTest
    @ValueSource(strings = {"aabbcce", "aabbccddeeffg"})
    void validatorPasswordTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Password must be in 8 to 12");
    }

    @DisplayName("Test random password")
    @Test
    void validatorPasswordTest3() {
        String password = new RandomPasswordGenerator().generatePassword();
        assertThatCode(() -> PasswordValidator.validate(password))
                .doesNotThrowAnyException();

    }
}
