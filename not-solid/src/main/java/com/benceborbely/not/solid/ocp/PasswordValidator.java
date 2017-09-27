package com.benceborbely.not.solid.ocp;

public class PasswordValidator {

    private static final int MIN_LENGTH = 10;
    private static final String AT_LEAST_ONE_NUMBER_PATTERN = ".*[0-9].*";

    public boolean isValid(String password) {
        if (password == null)
            return false;

        if (password.length() < MIN_LENGTH) {
            return false;
        }

        if (!password.matches(AT_LEAST_ONE_NUMBER_PATTERN)) {
            return false;
        }

        return true;
    }

}
