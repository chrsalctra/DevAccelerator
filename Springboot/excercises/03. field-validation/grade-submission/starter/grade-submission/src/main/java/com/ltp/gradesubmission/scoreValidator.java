package com.ltp.gradesubmission;
import java.util.List;
import java.util.Arrays;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class scoreValidator implements ConstraintValidator<Score, String>{
    List<String> score = Arrays.asList("A+", "A", "A-",
                                        "B+", "B", "B-",
                                        "C+", "C", "C-",
                                        "D+", "D", "D-",
                                        "F+"
    );
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        for (String string : score){
            if(value.equals(string)) return true;
        }
        return false;
        //throw new UnsupportedOperationException("Unimplemented method 'isValid'");
    }
    
}
