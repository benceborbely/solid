package com.benceborbely.solid.ocp;

public class MinLengthValidation implements Validation {

    private static final int MIN_LENGTH = 10;

    @Override
    public boolean isValid(String password) {
        return password.length() >= MIN_LENGTH;
    }

}
