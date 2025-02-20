package com.lcwd.electronic.store.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;


public class ImageNameValidator implements ConstraintValidator<ImageNameValid, String> {


    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        Logger logger = LoggerFactory.getLogger(ImageNameValidator.class);

        logger.info("Message from isValid : {}", s);

        //logic
        if(s.isBlank()) {
            return false;
        } else {
            return true;
        }

    }
}

