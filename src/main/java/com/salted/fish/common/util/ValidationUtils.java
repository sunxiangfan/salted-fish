package com.salted.fish.common.util;

import com.salted.fish.common.dto.ResultDTO;
import org.apache.commons.collections.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.groups.Default;
import java.util.Set;

public class ValidationUtils {

    private static javax.validation.Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    public static <T> ResultDTO validateEntity(T obj) {
        ResultDTO dto = new ResultDTO();
        Set<ConstraintViolation<T>> set = validator.validate(obj, Default.class);
        if (CollectionUtils.isNotEmpty(set)) {
            for (ConstraintViolation<T> cv : set) {
                dto.setCode(9999);
                dto.setMessage(cv.getMessage());
                return dto;
            }
        }
        return null;
    }
}