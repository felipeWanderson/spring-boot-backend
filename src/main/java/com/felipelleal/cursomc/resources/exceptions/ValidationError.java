package com.felipelleal.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldName> error = new ArrayList<>();
	
	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
	}

	public List<FieldName> getError() {
		return error;
	}

	public void addError(String fieldName, String mensagem) {
		error.add(new FieldName(fieldName, mensagem));
	}
}
