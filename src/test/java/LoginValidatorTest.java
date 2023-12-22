package test.java;

import main.java.LoginValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Pattern;


//EQUAVELANCE PARTITIONING //



class LoginValidatorTest {

    @Test
    void validateUsername() {
        LoginValidator validator = new LoginValidator();
        assertTrue(validator.validateUsername("validusername@example.com"));
    }

    @Test
    void test_Email_Without_At_Symbol() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validateUsername("validusergmail.com"));

    }

    @Test
    void test_email_without_domain() {
        LoginValidator validator = new LoginValidator();                  ////////// !!!!!!!!!!!1 //////////
        assertFalse(validator.validateUsername("sayar25@"));

    }

    @Test
    void emailWıthInvalidChars() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validateUsername("!mustafa@gmail.com"));

    }

    @Test
    void test_emptyEmailString() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validateUsername(null));

    }

    @Test
    void nullEmailAdress() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validateUsername(null));

    }

    @Test
    void validatePassword() {
        LoginValidator validator = new LoginValidator();
        assertTrue(validator.validatePassword("mustaf4_@sayar"));
    }

    @Test
    void password_wıthout_special_Chars() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validatePassword("mustafa45"));

    }

    @Test
    void password_wıthout_number() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validatePassword("mustafa_@"));

    }

    @Test
    void passwordTooShort() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validatePassword("syr12"));

    }

    @Test
    void passwordTooLong() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validatePassword("mustafa_sayar@123456789_"));

    }

    @Test
    void emptyPasswordString() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validatePassword(null));

    }

    @Test
    void nullPassword() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validatePassword(null));

    }


}