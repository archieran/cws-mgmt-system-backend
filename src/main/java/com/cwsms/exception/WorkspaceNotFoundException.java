package com.cwsms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WorkspaceNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4444605164502608466L;
	
	public WorkspaceNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
