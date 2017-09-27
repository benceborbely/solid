package com.benceborbely.solid.ocp;

public class NullValidation implements Validation {

    @Override
    public boolean isValid(String password) {
        return password != null;
    }

}
