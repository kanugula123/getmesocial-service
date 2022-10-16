package com.example.getmesocialservice.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNameValidator implements ConstraintValidator<ValidName,String> {

    @Override
    public void initialize(ValidName validName) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile("^[a-z0-9]*$");
        Matcher matcher = pattern.matcher(value);

        if (matcher.find())
            return true;
        else
            return false;
    }
}
