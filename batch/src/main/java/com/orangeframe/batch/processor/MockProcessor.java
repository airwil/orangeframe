package com.orangeframe.batch.processor;

import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;

public class MockProcessor<T> extends ValidatingItemProcessor<T> {

	@Override
	public T process(T item) throws ValidationException {
		// TODO Auto-generated method stub
		return super.process(item);
	}
	
}
