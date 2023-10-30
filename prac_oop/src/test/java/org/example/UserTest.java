package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @DisplayName("Reset Password")
    @Test
    void passwordTest() {
        //given
        User user = new User();
        user.initPassword(new CorrectFixedPasswordGenerator());

        assertThat(user.getPassword()).isNotNull();

    }
    @DisplayName("Reset Password")
    @Test
    void passwordTest2() {
        //given
        User user = new User();
        user.initPassword(new WrongFixedPasswordGenerator());

        assertThat(user.getPassword()).isNull();

    }
}