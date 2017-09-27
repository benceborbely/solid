package com.benceborbely.solid.ocp;

import java.util.LinkedList;
import java.util.List;

public class PasswordValidator {

    private List<Validation> validations = new LinkedList<>();

    public PasswordValidator(List<Validation> validations) {
        this.validations = validations;
    }

    public boolean isValid(String password) {
        return validations
                .stream()
                .allMatch(predicate -> predicate.isValid(password));
    }

}
