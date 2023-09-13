package com.tms.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailEngine implements ConstraintValidator<Email67,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.matches("[A-z0-9]{4,30}@[a-z]+\\.[a-z]{2,3}");

    }
}
