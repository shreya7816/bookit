package org.movie.bookit.request.validation.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import org.movie.bookit.request.validation.validators.SearchRequestValidator;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SearchRequestValidator.class)
public @interface ValidSearchRequest {

}
