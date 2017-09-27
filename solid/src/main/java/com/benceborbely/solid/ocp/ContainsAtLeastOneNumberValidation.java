package com.benceborbely.solid.ocp;

public class ContainsAtLeastOneNumberValidation implements Validation {

    private static final String AT_LEAST_ONE_NUMBER_PATTERN = ".*[0-9].*";

    @Override
    public boolean isValid(String password) {
        return password.matches(AT_LEAST_ONE_NUMBER_PATTERN);
    }

}
