package com.cathaybk.project.answer.service;

import com.cathaybk.project.answer.dto.OrderRequest;
import com.cathaybk.project.answer.dto.OrderResponse;
import com.cathaybk.project.answer.exception.DataNotFoundException;
import com.cathaybk.project.answer.exception.ErrorInputException;

public interface OrderService {
	
	OrderResponse queryOrder(OrderRequest orderRequest) throws DataNotFoundException;
	
	void insertOrder(OrderRequest orderRequest) throws ErrorInputException;
}
