package com.orangeframe.batch.validator;

import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;

public class MockValidator<T> implements Validator<T>{

	@Override
	public void validate(T value) throws ValidationException {
		// TODO Auto-generated method stub
		
	}

}
