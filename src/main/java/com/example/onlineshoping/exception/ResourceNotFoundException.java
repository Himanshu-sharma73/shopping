package com.example.onlineshoping.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
	private String errorCode;
	private String resourceName;
	private String fieldName;
	private int fieldValue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, int fieldValue, String errorCode) {
		super(String.format("%s not found with %s : %s",resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
		this.errorCode = errorCode;
	}
	
	
}
