package com.lcwd.electronic.store.validate;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

// @Target means ye notation hame kaha pe use krna hai, here we want to use it on field, parameter
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
// here validatedBy means who is validating
@Constraint(validatedBy = ImageNameValidator.class)

// here we creating custom validation for image
// using @interface here to make it annotation
public @interface ImageNameValid {

//    default error message
    String message() default "Invalid image name";

//    represent group of constraints
    Class<?>[] groups() default {};

    //additional information about annotation
    Class<? extends Payload>[] payload() default {};

}
