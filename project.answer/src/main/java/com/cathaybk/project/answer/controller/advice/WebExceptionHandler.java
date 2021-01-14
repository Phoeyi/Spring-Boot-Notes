package com.cathaybk.project.answer.controller.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cathaybk.project.answer.dto.CustomerResponse;
import com.cathaybk.project.answer.exception.DataNotFoundException;
import com.cathaybk.project.answer.exception.ErrorInputException;

public class WebExceptionHandler {

	/**
	 * ErrorInputException
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(ErrorInputException.class)
	public CustomerResponse handleErrorInputException() {

		CustomerResponse customerResponse = new CustomerResponse();
		customerResponse.setDatas(null);
		customerResponse.setMessage("ErrorInputException");

		return customerResponse;
	}
	
	/**
	 * DataNotFoundException
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(DataNotFoundException.class)
	public CustomerResponse handleDataNotFoundException() {

		CustomerResponse customerResponse = new CustomerResponse();
		customerResponse.setDatas(null);
		customerResponse.setMessage("DataNotFoundException");

		return customerResponse;
	}
}
