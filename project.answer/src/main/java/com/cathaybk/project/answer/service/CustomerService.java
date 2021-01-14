package com.cathaybk.project.answer.service;

import com.cathaybk.project.answer.dto.CustomerRequest;
import com.cathaybk.project.answer.dto.CustomerResponse;
import com.cathaybk.project.answer.exception.DataNotFoundException;

public interface CustomerService {
	
	/**
	 * 查詢顧客
	 * @return
	 */
	CustomerResponse queryCustomer(CustomerRequest customerRequest) throws DataNotFoundException;
	
	/**
	 * 新增顧客
	 */
	void insertCustomer();
	
	/**
	 * 修改顧客
	 */
	void updateCustomer();
}
