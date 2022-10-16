package com.example.getmesocialservice.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = {ValidNameValidator.class})
public @interface ValidName {
    String message() default "Please check the name for format";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
