package com.cathaybk.project.answer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cathaybk.project.answer.dto.CustomerRequest;
import com.cathaybk.project.answer.dto.CustomerResponse;
import com.cathaybk.project.answer.exception.DataNotFoundException;
import com.cathaybk.project.answer.exception.ErrorInputException;
import com.cathaybk.project.answer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	/**
	 * 查詢
	 * 
	 * @return
	 * @throws ErrorInputException
	 * @throws DataNotFoundException 
	 */
	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	public CustomerResponse queryCustomer(@Valid @RequestBody CustomerRequest customerRequest, Errors errs)
			throws ErrorInputException, DataNotFoundException {
		if (errs.hasErrors()) {
			throw new ErrorInputException();
		}

		return customerService.queryCustomer(customerRequest);
	}

	/**
	 * 新增
	 * 
	 * @param CustomerRequest
	 */
	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	public void insertCustomer(CustomerRequest CustomerRequest) {
	}
}
