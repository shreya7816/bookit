package org.movie.bookit.request.validation.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.movie.bookit.request.SearchRequest;
import org.movie.bookit.request.validation.annotations.ValidSearchRequest;

public class SearchRequestValidator implements ConstraintValidator<ValidSearchRequest, SearchRequest>{

	public boolean isValid(SearchRequest value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
